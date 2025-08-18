package ru.ok.android.externcalls.sdk.asr_online.listener;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.asr_online.AsrOnlineChunk;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/asr_online/listener/AsrOnlineListener;", "", "Lru/ok/android/externcalls/sdk/asr_online/AsrOnlineChunk;", "asrChunk", "Le5f;", "onAsrChunk", "(Lru/ok/android/externcalls/sdk/asr_online/AsrOnlineChunk;)V", "", "isAvailable", "onAsrAvailableChanged", "(Z)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface AsrOnlineListener {
    void onAsrAvailableChanged(boolean isAvailable);

    void onAsrChunk(AsrOnlineChunk asrChunk);
}
