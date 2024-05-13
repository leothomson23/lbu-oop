import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import uk.ac.leedsbeckett.oop.OOPGraphics;
public class TurtleGraphics extends OOPGraphics {
    public TurtleGraphics() {
        JFrame mainFrame = new JFrame();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.add(this);
        mainFrame.pack();
        mainFrame.setVisible(true);
        about();
    }

    public static final int WIDTH = 800;
    public static final int HEIGHT = 400;
    private List<String> validCommands = new ArrayList<>();
    private boolean isImageSaved = false;

    public void processCommand(String command) {
        String[] parts = command.split(" ");
        String mainCommand = parts[0];
        System.out.println("Command Entered: " + command);

        switch (mainCommand) {
            case "forward":
                if (parts.length < 2) {
                    System.out.println("Missing parameter. Syntax: 'forward [distance]'");
                } else {
                    try {
                        int distance = Integer.parseInt(parts[1]);
                        int newX = getxPos() + distance;
                        int newY = getyPos() - distance;

                        if ((newX < 0 || newX > WIDTH) || (newY < 0 || newY > HEIGHT)) {
                            System.out.println("Invalid input - takes turtle out of bounds.");
                        } else {
                            forward(distance);
                            validCommands.add(command);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Non-numeric parameter.");
                    }
                }
                break;
            case "backward":
                if (parts.length < 2) {
                    System.out.println("Missing parameter. Syntax: 'backward [distance]'");
                } else {
                    try {
                        int distance = Integer.parseInt(parts[1]);
                        int invertedDistance = -distance;
                        int newX = getxPos() + invertedDistance;

                        if (newX < 0 || newX > WIDTH) {
                            System.out.println("Invalid input - takes turtle out of bounds.");
                        } else {
                            forward(invertedDistance);
                            validCommands.add(command);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Non-numeric parameter.");
                    }
                }
                break;
            case "about":
                about();
                validCommands.add(command);
                break;
            case "penup":
                penUp();
                validCommands.add(command);
                break;
            case "pendown":
                penDown();
                validCommands.add(command);
                break;
            case "turnleft":
                if (parts.length < 2) {
                    System.out.println("Missing parameter. Syntax: 'turnleft [degrees]'");
                } else {
                    try {
                        int distance = Integer.parseInt(parts[1]);
                        turnLeft(distance);
                        validCommands.add(command);
                    } catch (NumberFormatException e) {
                        System.out.println("Non-numeric parameter.");
                    }
                }
                break;
            case "turnright":
                if (parts.length < 2) {
                    System.out.println("Missing parameter. Syntax: 'turnright [degrees]'");
                } else {
                    try {
                        int distance = Integer.parseInt(parts[1]);
                        turnRight(distance);
                        validCommands.add(command);
                    } catch (NumberFormatException e) {
                        System.out.println("Non-numeric parameter.");
                    }
                }
                break;
            case "black":
                setPenColour(Color.black);
                validCommands.add(command);
                break;
            case "green":
                setPenColour(Color.green);
                validCommands.add(command);
                break;
            case "red":
                setPenColour(Color.red);
                validCommands.add(command);
                break;
            case "white":
                setPenColour(Color.white);
                validCommands.add(command);
                break;
            case "reset":
                reset();
                validCommands.add(command);
                break;
            case "clear":
                displayBothWarnings();
                validCommands.add(command);
                break;
            case "getx":
                getxPos();
                validCommands.add(command);
                break;
            case "gety":
                getyPos();
                validCommands.add(command);
                break;
            case "saveimg":
                if (parts.length < 2) {
                    System.out.println("Missing parameter. Syntax: 'saveimg [filename]'");
                } else {
                    saveImage(parts[1]);
                    validCommands.add(command);
                }
                break;
            case "loadimg":
                if (parts.length < 2) {
                    System.out.println("Missing parameter. Syntax: 'loadimg [filename]'");
                } else {
                    loadImage(parts[1]);
                    validCommands.add(command);
                }
                break;
            case "square":
                if (parts.length < 2) {
                    System.out.println("Missing parameter. Syntax: 'square [length]'");
                } else {
                    try {
                        int length = Integer.parseInt(parts[1]);
                        for (int i = 0; i < 4; i++) {
                            forward(length);
                            turnRight(90);
                        }
                        validCommands.add(command);
                    } catch (NumberFormatException e) {
                        System.out.println("Non-numeric parameter.");
                    }
                }
                break;
            case "penwidth":
                if (parts.length != 2) {
                    System.out.println("Invalid number of parameters. Syntax: 'penwidth <width>'");
                }
                else {
                    try {
                        int width = Integer.parseInt(parts[1]);
                        setStroke(width);
                        validCommands.add(command);
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Invalid width. Please provide a valid integer value.");
                    }
                }
                break;
            case "pen":
                if (parts.length != 4) {
                    System.out.println("Invalid number of parameters. Syntax: 'pen [red] [green] [blue]'");
                }
                else {
                    try {
                        int red = Integer.parseInt(parts[1]);
                        int green = Integer.parseInt(parts[2]);
                        int blue = Integer.parseInt(parts[3]);

                        if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255) {
                            System.out.println("Invalid RGB values. Values must be between 0 and 255.");
                        }
                        else {
                            setPenColour(new Color(red, green, blue));
                            validCommands.add(command);
                        }
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Invalid RGB values. Please provide valid integer values.");
                    }
                }
                break;
            case "triangle":
                if (parts.length == 2) {
                    try {
                        int size = Integer.parseInt(parts[1]);
                        for (int i = 0; i < 3; i++) {
                            forward(size);
                            turnRight(120);
                        }
                        validCommands.add(command);
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Invalid size. Please provide a valid integer value.");
                    }
                }
                else if (parts.length == 4) {
                    try {
                        int side1 = Integer.parseInt(parts[1]);
                        int side2 = Integer.parseInt(parts[2]);
                        int side3 = Integer.parseInt(parts[3]);

                        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
                            penDown();
                            forward(side1);
                            double angle1 = Math.toDegrees(Math.acos((side2 * side2 + side3 * side3 - side1 * side1) / (2.0 * side2 * side3)));
                            turnRight((int) angle1);
                            forward(side2);
                            double angle2 = Math.toDegrees(Math.acos((side1 * side1 + side3 * side3 - side2 * side2) / (2.0 * side1 * side3)));
                            turnRight(180 - (int) (angle1 + angle2));
                            forward(side3);
                            validCommands.add(command);
                        }
                        else {
                            System.out.println("Invalid side lengths. Please provide lengths that form a valid triangle.");
                        }
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Invalid side lengths. Please provide valid integer values.");
                    }
                }
                else {
                    System.out.println("Invalid command. Syntax: 'triangle <side1>,<side2>,<side3>'");
                }
                break;
            case "savecmd":
                if (parts.length < 2) {
                    System.out.println("Missing parameter. Syntax: 'savecmd [filename]'");
                }
                else {
                    String filename = parts[1];
                    try {
                        saveCommands(filename);
                        System.out.println("Commands saved successfully.");
                    } catch (IOException e) {
                        System.out.println("Error saving commands: " + e.getMessage());
                    }
                }
                break;
            case "loadcmd":
                if (parts.length < 2) {
                    System.out.println("Missing parameter. Syntax: 'runcommands [filename]'");
                }
                else {
                    String filename = parts[1];
                    try {
                        loadCommands(filename);
                        System.out.println("Commands executed successfully.");
                    } catch (IOException e) {
                        System.out.println("Error loading commands: " + e.getMessage());
                    }
                }
                break;
            default:
                System.out.println("INVALID COMMAND: " + command);
        }
    }

    public void clear() {
        super.clear();
        isImageSaved = false;
    }

    private void saveImage(String filename) {
        BufferedImage image = getBufferedImage();
        try {
            File output = new File(filename + ".png");
            ImageIO.write(image, "png", output);
            System.out.println("Image saved successfully.");
            isImageSaved = true;
        } catch (IOException e) {
            System.out.println("Error saving image: " + e.getMessage());
        }
    }

    private void loadImage(String filename) {
        try {
            File input = new File(filename);
            BufferedImage image = ImageIO.read(input);
            setBufferedImage(image);
            System.out.println("Image loaded successfully.");
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
    }

    private void saveCommands(String filename) throws IOException {
        File file = new File(filename + ".txt");
        FileWriter writer = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        for (String command : validCommands) {
            bufferedWriter.write(command);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    private void loadCommands(String filename) throws IOException {
        reset();
        File file = new File(filename);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            processCommand(line);
        }
        bufferedReader.close();
    }

    private void displayBothWarnings() {
        displayConsoleWarning();
        displayGUIWarning();
    }

    private void displayConsoleWarning() {
        System.out.println("Warning: The current image is not saved.");
    }

    private void displayGUIWarning() {
        if (!isImageSaved) {
            int choice = JOptionPane.showConfirmDialog(null, "Current image is not saved. Do you want to continue?", "Warning", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.NO_OPTION) {
                return;
            }
        }
        clear();
        isImageSaved = false;
    }

    public void about() {
        super.about();
        try {
            loadCommands("leo.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}