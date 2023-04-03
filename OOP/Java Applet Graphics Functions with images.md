# Applet Draw Functions:

1. `drawArc(x, y, width, height, startAngle, arcAngle)` - used to draw an arc with specified dimensions and angles.

2. `drawLine(x1, y1, x2, y2)` - used to draw a line with specified start and end points.

3. `drawOval(x, y, width, height)` - used to draw an oval shape with specified dimensions.

4. `drawPolygon(xPoints, yPoints, nPoints)` - used to draw a polygon shape with specified vertices.

5. `drawRect(x, y, width, height)` - used to draw a rectangle shape with specified dimensions.

### Examples:

1. `drawArc()`:

```java
public void paint(Graphics g) {
   g.drawArc(100, 100, 50, 50, 45, 180);
}
```

Output Image:

![drawArc output image](https://i.imgur.com/Zq3r4Dw.png)

2. `drawLine()`:

```java
public void paint(Graphics g) {
   g.drawLine(50, 50, 200, 200);
}
```

Output Image:

![drawLine output image](https://i.imgur.com/sgGyHCC.png)


3. `drawOval()`:

```java
public void paint(Graphics g) {
   g.drawOval(100, 100, 50, 100);
}
```

Output Image:

![drawOval output image](https://i.imgur.com/kxUVpxi.png)


4. `drawPolygon()`:

```java
public void paint(Graphics g) {
   int[] xPoints = {100, 200, 150};
   int[] yPoints = {100, 100, 200};
   int nPoints = 3;

   g.drawPolygon(xPoints, yPoints, nPoints);
}
```

Output Image:

![drawPolygon output image](https://i.imgur.com/QJRg9wx.png)


5. `drawRect()`:

```java
public void paint(Graphics g) {
   g.drawRect(100, 100, 50, 50);
}
```

Output Image:

![drawRect output image](https://i.imgur.com/BdU6Mvn.png)


# Applet Fill Functions:

1. `fillArc(x, y, width, height, startAngle, arcAngle)` - used to fill an arc with specified dimensions and angles.

2. `fillOval(x, y, width, height)` - used to fill an oval shape with specified dimensions.

3. `fillPolygon(xPoints, yPoints, nPoints)` - used to fill a polygon shape with specified vertices.

4. `fillRect(x, y, width, height)` - used to fill a rectangle shape with specified dimensions.

### Examples:

1. `fillArc()`:

```java
public void paint(Graphics g) {
   g.fillArc(100, 100, 50, 50, 45, 180);
}
```

Output Image:

![fillArc output image](https://i.imgur.com/mdIFvE8.png)


2. `fillOval()`:

```java
public void paint(Graphics g) {
   g.fillOval(100, 100, 50, 100);
}
```

Output Image:

![fillOval output image](https://i.imgur.com/EMGpapv.png)


3. `fillPolygon()`:

```java
public void paint(Graphics g) {
   int[] xPoints = {100, 200, 150};
   int[] yPoints = {100, 100, 200};
   int nPoints = 3;

   g.fillPolygon(xPoints, yPoints, nPoints);
}
```

Output Image:

![fillPolygon output image](https://i.imgur.com/cXSqaL7.png)


4. `fillRect()`:

```java
public void paint(Graphics g) {
   g.fillRect(100, 100, 50, 50);
}
```

Output Image:

![fillRect output image](https://i.imgur.com/5MW5J0N.png)


# Applet Setting Functions:

1. `setColor(Color c)` - set the color to use for shapes and text.

2. `setFont(Font font)` - set the font to use for text.

3. `setPaintMode()` - set the paint mode to overwrite pixels.

4. `setXORMode(Color c)` - set the paint mode to XOR pixels.

### Examples:

1. `setColor()`:

```java
public void paint(Graphics g) {
   g.setColor(Color.BLUE);
   g.fillRect(50, 50, 100, 100);
}
```

Output Image:

![setColor output image](https://i.imgur.com/VwZil6Q.png)


2. `setFont()`:

```java
public void paint(Graphics g) {
   Font myFont = new Font("Arial", Font.BOLD, 20);
   g.setFont(myFont);
   g.drawString("Hello World!", 50, 50);
}
```

Output Image:

![setFont output image](https://i.imgur.com/X9XDJLx.png)


3. `setPaintMode()`:

```java
public void paint(Graphics g) {
   g.setPaintMode();
   g.setColor(Color.BLACK);
   g.fillRect(50, 50, 100, 100);
   g.setColor(Color.RED);
   g.fillRect(75, 75, 50, 50);
}
```

Output Image:

![setPaintMode output image](https://i.imgur.com/5pdRiWT.png)


4. `setXORMode()`:

```java
public void paint(Graphics g) {
   g.setXORMode(Color.BLUE);
   g.fillRect(50, 50, 100, 100);
   g.setColor(Color.RED);
   g.fillRect(75, 75, 50, 50);
}
```

Output Image:

![setXORMode output image](https://i.imgur.com/TZmEBbZ.png)