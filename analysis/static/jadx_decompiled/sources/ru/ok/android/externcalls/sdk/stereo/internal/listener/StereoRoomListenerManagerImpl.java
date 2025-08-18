package ru.ok.android.externcalls.sdk.stereo.internal.listener;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomListenerManager;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomListenerManager;", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener;", "<init>", "()V", "listener", "Le5f;", "addListener", "(Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener;)V", "removeListener", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener$ListenersUpdated;", "event", "onListenersChanged", "(Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener$ListenersUpdated;)V", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener$HandStatusUpdated;", "onHandStatusChange", "(Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener$HandStatusUpdated;)V", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener$PromotionRequestUpdated;", "onPromotionRequestUpdated", "(Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener$PromotionRequestUpdated;)V", "", "isPromoted", "onOwnPromotionChanged", "(Z)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class StereoRoomListenerManagerImpl implements StereoRoomListenerManager, StereoRoomManagerListener {
    private final CopyOnWriteArrayList<StereoRoomManagerListener> listeners = new CopyOnWriteArrayList<>();

    @Override // ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomListenerManager
    public void addListener(StereoRoomManagerListener listener) {
        this.listeners.add(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener
    public void onHandStatusChange(StereoRoomManagerListener.HandStatusUpdated event) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((StereoRoomManagerListener) it.next()).onHandStatusChange(event);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener
    public void onListenersChanged(StereoRoomManagerListener.ListenersUpdated event) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((StereoRoomManagerListener) it.next()).onListenersChanged(event);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener
    public void onOwnPromotionChanged(boolean isPromoted) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((StereoRoomManagerListener) it.next()).onOwnPromotionChanged(isPromoted);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener
    public void onPromotionRequestUpdated(StereoRoomManagerListener.PromotionRequestUpdated event) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((StereoRoomManagerListener) it.next()).onPromotionRequestUpdated(event);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomListenerManager
    public void removeListener(StereoRoomManagerListener listener) {
        this.listeners.remove(listener);
    }
}
