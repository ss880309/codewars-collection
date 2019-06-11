class ApproxFloat {
    public static double f(double x) {
        return x / (1.0 + Math.sqrt((1.0+x)));
    }
}
