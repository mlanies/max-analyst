package ru.ok.android.externcalls.sdk.feedback.internal.listeners;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedback;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedbackSource;
import ru.ok.android.externcalls.sdk.feedback.listener.FeedbackListener;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0014\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/feedback/internal/listeners/FeedbackListenerManager;", "", "", "millis", "Le5f;", "setTimeout", "(J)V", "", "key", "Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;", "source", "ownFeedbackSent", "(Ljava/lang/String;Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;)V", "Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedback;", "getOwnCurrentFeedback", "()Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedback;", "Lru/ok/android/externcalls/sdk/feedback/listener/FeedbackListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/feedback/listener/FeedbackListener;)V", "removeListener", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface FeedbackListenerManager {
    void addListener(FeedbackListener listener);

    ParticipantFeedback getOwnCurrentFeedback();

    void ownFeedbackSent(String key, ParticipantFeedbackSource source);

    void removeListener(FeedbackListener listener);

    void setTimeout(long millis);
}
