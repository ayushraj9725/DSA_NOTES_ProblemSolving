public class maths7 {
    public static int modExp(int base, int exp, int mod) {
        int result = 1;
        base = base % mod;
        while (exp > 0) {
            if ((exp % 2) == 1) { // If exp is odd
                result = (int)((result * (long)base) % mod);
            }
            exp = exp >> 1; // Divide exp by 2
            base = (int)((base * (long)base) % mod);
        }
        return result;
    }
    public static int nthTermOfGP(int N, int A, int R) {
    // Define the modulus
    int MOD = 1000000007;

    // Function to perform modular exponentiation
   

    if (N == 1) {
        return A % MOD;
    }

    // Compute R^(N-1) % MOD
    int RPower = modExp(R, N - 1, MOD);

    // Compute (A * R^(N-1)) % MOD
    int result = (int)((A * (long)RPower) % MOD);

    return result;
}
}
