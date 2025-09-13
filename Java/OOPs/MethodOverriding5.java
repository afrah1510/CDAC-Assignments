class Website {
    public void openWebsite() {
        System.out.println("Browser is used for opening websites");
    }
}

class Chrome extends Website {
    @Override
    public void openWebsite() {
        System.out.println("Chrome is opening Amazon");
    }
}

class Firefox extends Website {
    @Override
    public void openWebsite() {
        System.out.println("Firefox is opening Anna's Archive");
    }
}

public class MethodOverriding5 {
    public static void main(String[] args) {
        Website w = new Website();
        w.openWebsite();

        Chrome c = new Chrome();
        c.openWebsite();

        Firefox f = new Firefox();
        f.openWebsite();
    }
}
