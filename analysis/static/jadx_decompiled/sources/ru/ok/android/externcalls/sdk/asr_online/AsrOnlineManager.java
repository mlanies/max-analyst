package ru.ok.android.externcalls.sdk.asr_online;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.asr_online.listener.AsrOnlineListener;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\r\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/asr_online/AsrOnlineManager;", "", "", "isAsrAvailable", "()Z", "isEnabled", "Le5f;", "enableAsrOnline", "(Z)V", "Lru/ok/android/externcalls/sdk/asr_online/listener/AsrOnlineListener;", "listener", "addAsrOnlineListener", "(Lru/ok/android/externcalls/sdk/asr_online/listener/AsrOnlineListener;)V", "removeAsrOnlineListener", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface AsrOnlineManager {
    void addAsrOnlineListener(AsrOnlineListener listener);

    void enableAsrOnline(boolean isEnabled);

    boolean isAsrAvailable();

    void removeAsrOnlineListener(AsrOnlineListener listener);
}
