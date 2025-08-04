class Function {
    static void show() {
        // Logic...
        System.out.println("I am the Show");
        return; // exit from the function...
    }

    void disp() {
        System.out.println("I am the Disp...");
    }

    public static void main(String[] args) {
        Function f = new Function();
        f.disp();
        show();
    }

}