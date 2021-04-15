# Note on SVG images

To also support the dark mode in GitHub better, the transparent background of these SVG images is overlayed by a white rectangle.

For this, the first child of the `<svg>` node has to be the following:

```xml
    <!--Manually added white background, to support GitHub dark mode better-->
    <rect width="100%" height="100%" fill="white"/>
```
