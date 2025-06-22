package DesignPattern.Behavioural.Observer;

public class Client {
    public static void main(String[] args) {
        YoutubeChannelImpl youtubeChannel = new YoutubeChannelImpl();
        YouTubeSubscriber subscriber = new YouTubeSubscriber("Arnab");
        youtubeChannel.addSubscriber(subscriber);
        youtubeChannel.updateNewVideo("Squid Games");
    }
}
