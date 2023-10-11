package org.biltopia;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static int counter = 0;
    public static int index = 0;
    public static int count = 0;
    public static final Stack<Integer> stack = new Stack<>();

    public static final byte[] cells = new byte[1000];

    public static void IF(boolean b, Runnable f1, Runnable f2) {
        Runnable[] arr = new Runnable[]{f2, f1};
        arr[Boolean.compare(b, true) + 1].run();
    }

    public static void WHILE(Runnable runnable) {
        try {
            runnable.run();
            WHILE(runnable);
        } catch (RuntimeException exception) {
        }
    }

    public static void main(String[] args) {
        try {
            ArrayList<Character> list = new ArrayList<Character>();
            BufferedReader reader = new BufferedReader(new FileReader("input.bf"));
            WHILE(() -> {
                try {
                    int k = reader.read();
                    IF(k == -1, () -> {
                        throw new RuntimeException();
                    }, () -> {
                        list.add((char) k);
                    });
                } catch (IOException exception) {

                }

            });

            WHILE(() -> {
                char c = list.get(index);
                index++;
                IF(c == '>', () -> {
                    counter++;
                }, () -> {
                    IF(c == '<', () -> {
                        counter--;
                    }, () -> {
                        IF(c == '+', () -> {
                            cells[counter]++;
                        }, () -> {
                            IF(c == '-', () -> {
                                cells[counter]--;
                            }, () -> {
                                IF(c == '.', () -> {
                                    System.out.print((char)cells[counter]);
                                }, () -> {
                                    IF(c == ',', () -> {
                                        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
                                        try {
                                            byte d = (byte) r.read();
                                            cells[counter] = d;
                                        } catch (IOException exception) {

                                        }
                                    }, () -> {
                                        IF(c == '[', () -> {
                                            stack.push(index-1);
                                            count = 0;
                                            IF(cells[counter] == 0, () -> {
                                                WHILE(() -> {
                                                    char c2 = list.get(index);
                                                    index++;
                                                    IF(c2 == ']', () -> {
                                                        stack.pop();
                                                        IF(count == 0, () -> {
                                                            throw new RuntimeException();
                                                        }, () -> {
                                                            count--;
                                                        });
                                                    }, () -> {
                                                        IF(c2 == '[', () -> {
                                                            stack.push(index-1);
                                                            count++;
                                                        }, () -> {});
                                                    });
                                                });
                                            }, () -> {

                                            });
                                        }, () -> {
                                            IF(c == ']', () -> {
                                                IF (cells[counter] != 0, () -> {
                                                    index = stack.peek() + 1;
                                                }, stack::pop);
                                            }, () -> {});
                                        });
                                    });
                                });

                            });
                        });
                    });
                });
            });
        } catch (FileNotFoundException exception) {

        }
    }
}