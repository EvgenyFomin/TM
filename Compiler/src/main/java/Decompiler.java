

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Decompiler {

    private static final int SIZE = 1000;
    private static String[] commands;
    private static int[] pool = new int[SIZE];

    public static void readBytecode(String file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String cmd = br.readLine();
        ArrayList<String> commandsList = new ArrayList<>();
        while (cmd != null) {
            commandsList.add(cmd);
            cmd = br.readLine();
        }
        commands = new String[commandsList.size()];
        for (int i = 0; i < commands.length; i++) {
            commands[i] = commandsList.get(i);
        }
    }

    public static String[] deleteEmpty(String[] is) {
        ArrayList<String> ar = new ArrayList<>();
        for (String s : is) {
            if (!s.isEmpty()) {
                ar.add(s);
            }
        }
        String[] ns = new String[ar.size()];
        for (int i = 0; i < ns.length; i++) {
            ns[i] = ar.get(i);
        }
        return ns;
    }

    public static void decompile() throws IOException {
        readBytecode("compiled");
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        int ptr = 0;
        Stack<Integer> stack = new Stack<>();
        boolean suspend = false;
        while (!suspend) {
            if (ptr >= commands.length) {
                break;
            }
            String command = commands[ptr];
            command = command.substring(command.indexOf(' '));
            String[] split = command.split(" ");
            split = deleteEmpty(split);
            int arg = 0;
            if (split.length > 1) {
                arg = Integer.parseInt(split[1]);
            }
            ptr++;
            switch (split[0]) {
                case "push": {
                    stack.push(arg);
                    break;
                }
                case "store": {
                    pool[arg] = stack.pop();
                    break;
                }
                case "load":{
                    stack.push(pool[arg]);
                    break;
                }
                case "add":{
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b + a);
                    break;
                }
                case "sub":{
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b - a);
                    break;
                }
                case "mul":{
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b * a);
                    break;
                }
                case "div":{
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b / a);
                    break;
                }
                case "rem":{
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b % a);
                    break;
                }
                case "neg":{
                    int a = stack.pop();
                    stack.push(-a);
                    break;
                }
                case "dup":{
                    int a = stack.pop();
                    stack.push(a);
                    stack.push(a);
                    break;
                }
                case "goto": {
                    ptr = arg;
                    break;
                }
                case "ifeq": {
                    int a = stack.pop();
                    int b = stack.pop();
                    if (a == b) {
                        ptr = arg;
                    }
                    break;
                }
                case "ifne":{
                    int a = stack.pop();
                    int b = stack.pop();
                    if (a != b) {
                        ptr = arg;
                    }
                    break;
                }
                case "ifgt":{
                    int a = stack.pop();
                    int b = stack.pop();
                    if (b > a) {
                        ptr = arg;
                    }
                    break;
                }
                case "iflt":{
                    int a = stack.pop();
                    int b = stack.pop();
                    if (b < a) {
                        ptr = arg;
                    }
                    break;
                }
                case "ifge":{
                    int a = stack.pop();
                    int b = stack.pop();
                    if (b >= a) {
                        ptr = arg;
                    }
                    break;
                }
                case "ifle":{
                    int a = stack.pop();
                    int b = stack.pop();
                    if (b <= a) {
                        ptr = arg;
                    }
                    break;
                }
                case "ifncmp":{
                    boolean a = stack.pop() == 0;
                    if (a) {
                        ptr = arg;
                    }
                    break;
                }
                case "ceq": {
                    int a = stack.pop();
                    int b = stack.pop();
                    if (a == b) {
                        stack.push(1);
                    } else {
                        stack.push(0);
                    }
                    break;
                }
                case "cne":{
                    int a = stack.pop();
                    int b = stack.pop();
                    if (a != b) {
                        stack.push(1);
                    } else {
                        stack.push(0);
                    }
                    break;
                }
                case "cgt":{
                    int a = stack.pop();
                    int b = stack.pop();
                    if (b > a) {
                        stack.push(1);
                    } else {
                        stack.push(0);
                    }
                    break;
                }
                case "clt":{
                    int a = stack.pop();
                    int b = stack.pop();
                    if (b < a) {
                        stack.push(1);
                    } else {
                        stack.push(0);
                    }
                    break;
                }
                case "cge":{
                    int a = stack.pop();
                    int b = stack.pop();
                    if (b >= a) {
                        stack.push(1);
                    } else {
                        stack.push(0);
                    }
                    break;
                }
                case "cle":{
                    int a = stack.pop();
                    int b = stack.pop();
                    if (b <= a) {
                        stack.push(1);
                    } else {
                        stack.push(0);
                    }
                    break;
                }
                case "or":{
                    boolean a = stack.pop() != 0;
                    boolean b = stack.pop() != 0;
                    if (a || b) {
                        stack.push(1);
                    } else {
                        stack.push(0);
                    }
                    break;
                }
                case "xor":{
                    boolean a = stack.pop() != 0;
                    boolean b = stack.pop() != 0;
                    if (a ^ b) {
                        stack.push(1);
                    } else {
                        stack.push(0);
                    }
                }
                case "and":{
                    boolean a = stack.pop() != 0;
                    boolean b = stack.pop() != 0;
                    if (a && b) {
                        stack.push(1);
                    } else {
                        stack.push(0);
                    }
                }
                case "print":{
                    System.out.println(stack.pop());
                    break;
                }
                case "read":{
                    stack.push(sc.nextInt());
                    break;
                }
                case "return": {
                    suspend = true;
                    break;
                }
                default:
                    System.err.println("Unknown command");
                    suspend = true;
            }
        }
    }

}
