package DesignPattern.Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannelImpl implements YoutubeChannel{
    private List<Subscriber> subscribers =  new ArrayList<>();
    private String video;
    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber() {
        for(Subscriber subscriber : subscribers)
        {
            subscriber.update(video);
        }
    }

    public void updateNewVideo(String video)
    {
        this.video = video;
        notifySubscriber();
    }
}
