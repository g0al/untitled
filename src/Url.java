class Url {

    Url(String url) {
        parsedUrl = url.split("://");
    }

    String[] parsedUrl;

    public String getProtocol() {
        return parsedUrl[0];
    }

    public String getHost() {
        return parsedUrl[1];
    }
}