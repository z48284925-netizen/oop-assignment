void main() {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    int total=0.3*x+0.3*y+0.4*z;
    if (x >= 50) {
        System.out.println("");
    } else if (x >= 25) {
        System.out.println("FX");
    } else {
        System.out.println("summer trimester");
    }
}
