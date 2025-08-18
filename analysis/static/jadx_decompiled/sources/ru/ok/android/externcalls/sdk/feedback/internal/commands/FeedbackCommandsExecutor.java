package ru.ok.android.externcalls.sdk.feedback.internal.commands;

import defpackage.k56;
import defpackage.m56;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J=\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/feedback/internal/commands/FeedbackCommandsExecutor;", "", "", "key", "Lkotlin/Function1;", "", "Le5f;", "onError", "Lkotlin/Function0;", "onSuccess", "sendFeedback", "(Ljava/lang/String;Lm56;Lk56;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface FeedbackCommandsExecutor {
    void sendFeedback(String key, m56 onError, k56 onSuccess);
}
