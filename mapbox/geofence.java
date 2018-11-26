CircleLayer circleLayer = new CircleLayer("circle-layer", "circle-source");
circleLayer.setProperties(
    PropertyFactory.visibility(Property.VISIBLE),
    PropertyFactory.circleRadius(25f),
    PropertyFactory.circleColor(Color.argb(1, 55, 148, 179)));
mapboxMap.addLayer(circleLayer);
