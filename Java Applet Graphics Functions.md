# Applet Draw Functions:

1. `drawArc(x, y, width, height, startAngle, arcAngle)` - used to draw an arc with specified dimensions and angles.
2. `drawLine(x1, y1, x2, y2)` - used to draw a line with specified start and end points.
3. `drawOval(x, y, width, height)` - used to draw an oval shape with specified dimensions.
4. `drawPolygon(xPoints, yPoints, nPoints)` - used to draw a polygon shape with specified vertices.
5. `drawRect(x, y, width, height)` - used to draw a rectangle shape with specified dimensions.

## Examples:
1. `drawArc():` 
```java
public void paint(Graphics g) {
   g.drawArc(100, 100, 50, 50, 45, 180);
}
```
This code will draw an arc with the following parameters: 
- `x`-position of the starting point: 100
- `y`-position of the starting point: 100
- `width` of the arc: 50
- `height` of the arc: 50
- `startAngle` of the arc: 45 degrees
- `arcAngle` (how many degrees the arc extends) of the arc: 180 degrees

2. `drawLine():` 
```java
public void paint(Graphics g) {
   g.drawLine(50, 50, 200, 200);
}
```

This code will draw a line with the following parameters: 
- `x1`-position of the start point: 50
- `y1`-position of the start point: 50
- `x2`-position of the end point: 200
- `y2`-position of the end point: 200

3. `drawOval():` 
```java
public void paint(Graphics g) {
   g.drawOval(100, 100, 50, 100);
}
```

This code will draw an oval with the following parameters: 
- `x`-position of the starting point: 100
- `y`-position of the starting point: 100
- `width` of the oval: 50
- `height` of the oval: 100

4. `drawPolygon():` 
```java
public void paint(Graphics g) {
   int[] xPoints = {100, 200, 150};
   int[] yPoints = {100, 100, 200};
   int nPoints = 3;

   g.drawPolygon(xPoints, yPoints, nPoints);
}
```

This code will draw a polygon with the following parameters: 
- `xPoints`-positions of the vertices: {100, 200, 150}
- `yPoints`-positions of the vertices: {100, 100, 200}
- `nPoints` number of vertices: 3

5. `drawRect():` 
```java
public void paint(Graphics g) {
   g.drawRect(100, 100, 50, 50);
}
```

This code will draw a rectangle with the following parameters: 
- `x`-position of the starting point: 100
- `y`-position of the starting point: 100
- `width` of the rectangle: 50
- `height` of the rectangle: 50

# Applet Fill Functions:
1. `fillArc(x, y, width, height, startAngle, arcAngle)` - used to fill an arc with specified dimensions and angles.
2. `fillOval(x, y, width, height)` - used to fill an oval shape with specified dimensions.
3. `fillPolygon(xPoints, yPoints, nPoints)` - used to fill a polygon shape with specified vertices.
4. `fillRect(x, y, width, height)` - used to fill a rectangle shape with specified dimensions.

## Examples:
1. `fillArc():` 
```java
public void paint(Graphics g) {
   g.fillArc(100, 100, 50, 50, 45, 180);
}
```
This code will fill an arc with the following parameters: 
- `x`-position of the starting point: 100
- `y`-position of the starting point: 100
- `width` of the arc: 50
- `height` of the arc: 50
- `startAngle` of the arc: 45 degrees
- `arcAngle` (how many degrees the arc extends) of the arc: 180 degrees

2. `fillOval():` 
```java
public void paint(Graphics g) {
   g.fillOval(100, 100, 50, 100);
}
```

This code will fill an oval with the following parameters: 
- `x`-position of the starting point: 100
- `y`-position of the starting point: 100
- `width` of the oval: 50
- `height` of the oval: 100

3. `fillPolygon():` 
```java
public void paint(Graphics g) {
   int[] xPoints = {100, 200, 150};
   int[] yPoints = {100, 100, 200};
   int nPoints = 3;

   g.fillPolygon(xPoints, yPoints, nPoints);
}
```

This code will fill a polygon with the following parameters: 
- `xPoints`-positions of the vertices: {100, 200, 150}
- `yPoints`-positions of the vertices: {100, 100, 200}
- `nPoints` number of vertices: 3

4. `fillRect():` 
```java
public void paint(Graphics g) {
   g.fillRect(100, 100, 50, 50);
}
```

This code will fill a rectangle with the following parameters: 
- `x`-position of the starting point: 100
- `y`-position of the starting point: 100
- `width` of the rectangle: 50
- `height` of the rectangle: 50

# Applet Setting Functions:
1. `setColor(color)` - set the color to use for shapes and text.
2. `setFont(font)` - set the font to use for text.
3. `setPaintMode()` - set the paint mode to overwrite pixels.
4. `setXORMode(color)` - set the paint mode to XOR pixels.

## Examples:
1. `setColor():` 
```java
public void paint(Graphics g) {
   g.setColor(Color.BLUE);
   g.fillRect(50, 50, 100, 100);
}
```

This code will fill a rectangle with the following parameters: 
- `x`-position of the starting point: 50
- `y`-position of the starting point: 50
- `width` of the rectangle: 100
- `height` of the rectangle: 100
- `color` of the rectangle: blue

2. `setFont():` 
```java
public void paint(Graphics g) {
   Font myFont = new Font("Arial", Font.BOLD, 20);
   g.setFont(myFont);
   g.drawString("Hello World!", 50, 50);
}
```

This code will write "Hello World!" at the following position: 
- `x`-position of the starting point: 50
- `y`-position of the starting point: 50
- `font`: Arial, bold style, size 20

3. `setPaintMode():` 
```java
public void paint(Graphics g) {
   g.setPaintMode();
   g.setColor(Color.BLACK);
   g.fillRect(50, 50, 100, 100);
   g.setColor(Color.RED);
   g.fillRect(75, 75, 50, 50);
}
```

This code will fill a rectangle with the following parameters: 
- `x`-position of the starting point: 50
- `y`-position of the starting point: 50
- `width` of the rectangle: 100
- `height` of the rectangle: 100
- `color` of the rectangle: black
- fill a smaller rectangle within the larger rectangle with the following parameters: 
     - `x`-position of the starting point: 75
     - `y`-position of the starting point: 75
     - `width` of the rectangle: 50
     - `height` of the rectangle: 50
     - `color` of the rectangle: red

4. `setXORMode():` 
```java
public void paint(Graphics g) {
   g.setXORMode(Color.BLUE);
   g.fillRect(50, 50, 100, 100);
   g.setColor(Color.RED);
   g.fillRect(75, 75, 50, 50);
}
```

This code will fill a rectangle with the following parameters: 
- `x`-position of the starting point: 50
- `y`-position of the starting point: 50
- `width` of the rectangle: 100
- `height` of the rectangle: 100
- `color` of the rectangle: blue
- fill a smaller rectangle within the larger rectangle with the following parameters: 
     - `x`-position of the starting point: 75
     - `y`-position of the starting point: 75
     - `width` of the rectangle: 50
     - `height` of the rectangle: 50
     - `color` of the rectangle: red
- XOR the red rectangle with the blue rectangle