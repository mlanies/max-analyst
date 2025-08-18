package ru.ok.android.externcalls.sdk.feedback.listener;

import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedback;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/feedback/listener/FeedbackListener;", "", "", "Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedback;", "feedback", "Le5f;", "onFeedbackAdded", "(Ljava/util/List;)V", "onFeedbackRemoved", "", "isEnabled", "onFeedbackEnabledChanged", "(Z)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface FeedbackListener {
    void onFeedbackAdded(List<ParticipantFeedback> feedback);

    void onFeedbackEnabledChanged(boolean isEnabled);

    void onFeedbackRemoved(List<ParticipantFeedback> feedback);
}
