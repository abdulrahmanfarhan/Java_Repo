package Extra.EnglishLettersArrays;

public class EnglishLettersArrays {

    public static String[] A = {
        "  ###  ",
        " #   # ",
        " ##### ",
        " #   # ",
        " #   # "
    };

    public static String[] B = {
        "####  ",
        "#   # ",
        "####  ",
        "#   # ",
        "####  "
    };

    public static String[] C = {
        " #### ",
        "#     ",
        "#     ",
        "#     ",
        " #### "
    };

    public static String[] D = {
        "####  ",
        "#   # ",
        "#   # ",
        "#   # ",
        "####  "
    };

    public static String[] E = {
        "##### ",
        "#     ",
        "####  ",
        "#     ",
        "##### "
    };

    public static String[] F = {
        "##### ",
        "#     ",
        "####  ",
        "#     ",
        "#     "
    };

    public static String[] G = {
        " #### ",
        "#     ",
        "#  ## ",
        "#   # ",
        " #### "
    };

    public static String[] H = {
        "#   # ",
        "#   # ",
        "##### ",
        "#   # ",
        "#   # "
    };

    public static String[] I = {
        "##### ",
        "  #   ",
        "  #   ",
        "  #   ",
        "##### "
    };

    public static String[] J = {
        "##### ",
        "   #  ",
        "   #  ",
        "#  #  ",
        " ##   "
    };

    public static String[] K = {
        "#   # ",
        "#  #  ",
        "###   ",
        "#  #  ",
        "#   # "
    };

    public static String[] L = {
        "#     ",
        "#     ",
        "#     ",
        "#     ",
        "##### "
    };

    public static String[] M = {
        "#   # ",
        "## ## ",
        "# # # ",
        "#   # ",
        "#   # "
    };

    public static String[] N = {
        "#   # ",
        "##  # ",
        "# # # ",
        "#  ## ",
        "#   # "
    };

    public static String[] O = {
        " ###  ",
        "#   # ",
        "#   # ",
        "#   # ",
        " ###  "
    };

    public static String[] P = {
        "####  ",
        "#   # ",
        "####  ",
        "#     ",
        "#     "
    };

    public static String[] Q = {
        " ###  ",
        "#   # ",
        "#   # ",
        "#  ## ",
        " #### "
    };

    public static String[] R = {
        "####  ",
        "#   # ",
        "####  ",
        "#  #  ",
        "#   # "
    };

    public static String[] S = {
        " #### ",
        "#     ",
        " ###  ",
        "    # ",
        "####  "
    };

    public static String[] T = {
        "##### ",
        "  #   ",
        "  #   ",
        "  #   ",
        "  #   "
    };

    public static String[] U = {
        "#   # ",
        "#   # ",
        "#   # ",
        "#   # ",
        " ###  "
    };

    public static String[] V = {
        "#   # ",
        "#   # ",
        "#   # ",
        " # #  ",
        "  #   "
    };

    public static String[] W = {
        "#   # ",
        "#   # ",
        "# # # ",
        "## ## ",
        "#   # "
    };

    public static String[] X = {
        "#   # ",
        " # #  ",
        "  #   ",
        " # #  ",
        "#   # "
    };

    public static String[] Y = {
        "#   # ",
        " # #  ",
        "  #   ",
        "  #   ",
        "  #   "
    };

    public static String[] Z = {
        "##### ",
        "   #  ",
        "  #   ",
        " #    ",
        "##### "
    };

    public static void printName(String str) {
        printLine(str.length());
        String name = str.toUpperCase();
        char letters[] = name.toCharArray();
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < name.length(); i++) {
                switch (letters[i]) {
                    case 'A':
                        System.out.print(A[j]);
                        break;
                    case 'B':
                        System.out.print(B[j]);
                        break;
                    case 'C':
                        System.out.print(C[j]);
                        break;
                    case 'D':
                        System.out.print(D[j]);
                        break;
                    case 'E':
                        System.out.print(E[j]);
                        break;
                    case 'F':
                        System.out.print(F[j]);
                        break;
                    case 'G':
                        System.out.print(G[j]);
                        break;
                    case 'H':
                        System.out.print(H[j]);
                        break;
                    case 'I':
                        System.out.print(I[j]);
                        break;
                    case 'J':
                        System.out.print(J[j]);
                        break;
                    case 'K':
                        System.out.print(K[j]);
                        break;
                    case 'L':
                        System.out.print(L[j]);
                        break;
                    case 'M':
                        System.out.print(M[j]);
                        break;
                    case 'N':
                        System.out.print(N[j]);
                        break;
                    case 'O':
                        System.out.print(O[j]);
                        break;
                    case 'P':
                        System.out.print(P[j]);
                        break;
                    case 'Q':
                        System.out.print(Q[j]);
                        break;
                    case 'R':
                        System.out.print(R[j]);
                        break;
                    case 'S':
                        System.out.print(S[j]);
                        break;
                    case 'T':
                        System.out.print(T[j]);
                        break;
                    case 'U':
                        System.out.print(U[j]);
                        break;
                    case 'V':
                        System.out.print(V[j]);
                        break;
                    case 'W':
                        System.out.print(W[j]);
                        break;
                    case 'X':
                        System.out.print(X[j]);
                        break;
                    case 'Y':
                        System.out.print(Y[j]);
                        break;
                    case 'Z':
                        System.out.print(Z[j]);
                        break;
                }
            }
            System.out.println("");
        }
        printLine2(str.length());
        printLine(str.length());
    }

    public static void printLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("------");
        }
        System.out.println("");
    }

    public static void printLine2(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("______");
        }
        System.out.println("");
    }
}
