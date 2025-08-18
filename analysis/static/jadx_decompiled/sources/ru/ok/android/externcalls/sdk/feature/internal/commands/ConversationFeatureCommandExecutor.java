package ru.ok.android.externcalls.sdk.feature.internal.commands;

import defpackage.eg1;
import defpackage.k56;
import defpackage.m56;
import defpackage.u61;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J=\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJK\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/feature/internal/commands/ConversationFeatureCommandExecutor;", "", "Lu61;", "feature", "Lkotlin/Function0;", "Le5f;", "onComplete", "Lkotlin/Function1;", "", "onError", "enableFeatureForAll", "(Lu61;Lk56;Lm56;)V", "", "Leg1;", "roles", "enableFeatureForRoles", "(Lu61;Ljava/util/Set;Lk56;Lm56;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface ConversationFeatureCommandExecutor {
    void enableFeatureForAll(u61 feature, k56 onComplete, m56 onError);

    void enableFeatureForRoles(u61 feature, Set<? extends eg1> roles, k56 onComplete, m56 onError);
}
