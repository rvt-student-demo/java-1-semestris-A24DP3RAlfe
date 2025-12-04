package rvt;

public class Chapter50 {
    public static void main(String[] args) {
    }
        public static void ex1() {
            class Box {
                private final double width;
                private final double height;
                private final double length;

                Box(double width, double height, double length) {
                    this.width = width;
                    this.height = height;
                    this.length = length;
                }

                Box(double side) {
                    this(side, side, side);
                }

                public double volume() {
                    return width * height * length;
                }

                public double area() {
                    return 2 * (width * height + width * length + height * length);
                }

                public double getWidth() { return width; }
                public double getHeight() { return height; }
                public double getLength() { return length; }
            }


            Box box = new Box(2.5, 5.0, 6.0);
            System.out.println("Area: " + box.area() + " volume: " + box.volume());

            Box cube = new Box(3.0);
            System.out.println("Cube area: " + cube.area() + " volume: " + cube.volume());

            System.out.println("length: " + box.getLength() + " height: " + box.getHeight() +
                               " width:  " + box.getWidth());
        }
        public static void ex2() {
            {
            class Box {
                private final double width;
                private final double height;
                private final double length;

                Box(double width, double height, double length) {
                this.width = width;
                this.height = height;
                this.length = length;
                }

                Box(double side) {
                this(side, side, side);
                }

                public double volume() {
                return width * height * length;
                }

                public double area() {
                return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
                }

                private double faceArea() { return width * height; }
                private double topArea()  { return width * length; }
                private double sideArea() { return height * length; }
            }

            Box box = new Box(2.5, 5.0, 6.0);
            System.out.println("Area: " + box.area() + " volume: " + box.volume());

            Box cube = new Box(3.0);
            System.out.println("Cube area: " + cube.area() + " volume: " + cube.volume());
            }
        }
        public static void ex3() {
                class Box {
                    private final double width;
                    private final double height;
                    private final double length;

                    Box(double width, double height, double length) {
                        this.width = width;
                        this.height = height;
                        this.length = length;
                    }

                    Box(double side) {
                        this(side, side, side);
                    }

                    Box(Box oldBox) {
                        this(oldBox.width, oldBox.height, oldBox.length);
                    }

                    public double volume() {
                        return width * height * length;
                    }

                    public double area() {
                        return 2 * (width * height + width * length + height * length);
                    }

                    public double length()  { return this.length; }
                    public double height()  { return this.height; }
                    public double width()   { return this.width; }
                }

                Box box = new Box(2.5, 5.0, 6.0);
                System.out.println("Area: " + box.area() + " volume: " + box.volume());

                Box cube = new Box(3.0);
                System.out.println("Cube area: " + cube.area() + " volume: " + cube.volume());

                Box copy = new Box(box);
                System.out.println("Copy length: " + copy.length() + " height: " + copy.height() +
                                   " width: " + copy.width());
            
        }
        public static void ex4() {
                class Box {
                    private final double w;
                    private final double h;
                    private final double l;

                    Box(double w, double h, double l) {
                        this.w = w;
                        this.h = h;
                        this.l = l;
                    }

                    Box(double side) {
                        this(side, side, side);
                    }

                    Box(Box other) {
                        this(other.w, other.h, other.l);
                    }

                    public double volume() {
                        return w * h * l;
                    }

                    public double area() {
                        return 2 * (w * h + w * l + h * l);
                    }

                    public double width() { return w; }
                    public double height() { return h; }
                    public double length() { return l; }

                    public Box biggerBox(Box oldBox) {
                        return new Box(1.25 * oldBox.width(), 1.25 * oldBox.height(), 1.25 * oldBox.length());
                    }

                    public Box smallerBox(Box oldBox) {
                        return new Box(0.75 * oldBox.width(), 0.75 * oldBox.height(), 0.75 * oldBox.length());
                    }
                }

                Box box = new Box(2.5, 5.0, 6.0);
                System.out.println("Area: " + box.area() + " volume: " + box.volume());

                Box cube = new Box(3.0);
                System.out.println("Cube area: " + cube.area() + " volume: " + cube.volume());

                Box bigger = box.biggerBox(box);
                System.out.println("Bigger area: " + bigger.area() + " volume: " + bigger.volume());

                Box smaller = box.smallerBox(box);
                System.out.println("Smaller area: " + smaller.area() + " volume: " + smaller.volume());

                Box copy = new Box(box);
                System.out.println("Copy length: " + copy.length() + " height: " + copy.height() +
                                   " width: " + copy.width());
            }
        
        public static void ex5() {
            {
                class Box {
                    private final double w;
                    private final double h;
                    private final double l;

                    Box(double w, double h, double l) { this.w = w; this.h = h; this.l = l; }
                    Box(double side) { this(side, side, side); }

                    public double width() { return w; }
                    public double height() { return h; }
                    public double length() { return l; }

                    public double volume() { return w * h * l; }
                    public double area() { return 2 * (w * h + w * l + h * l); }

                    public boolean nests(Box outsideBox) {
                        return this.width() <= outsideBox.width()
                            && this.height() <= outsideBox.height()
                            && this.length() <= outsideBox.length();
                    }
                }

                Box box = new Box(2.5, 5.0, 6.0);
                Box cube = new Box(3.0);
                System.out.println("box volume: " + box.volume() + " area: " + box.area());
                System.out.println("cube volume: " + cube.volume() + " area: " + cube.area());
                System.out.println("box nests cube: " + box.nests(cube));
                System.out.println("cube nests box: " + cube.nests(box));
                Box same = new Box(2.5, 5.0, 6.0);
                System.out.println("box nests same: " + box.nests(same));
            }
        }
    }
