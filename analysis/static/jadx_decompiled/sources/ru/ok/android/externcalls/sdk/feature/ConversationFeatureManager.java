package ru.ok.android.externcalls.sdk.feature;

import defpackage.eg1;
import defpackage.k56;
import defpackage.m56;
import defpackage.u61;
import java.util.Set;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001\u001cJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJA\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fH&¢\u0006\u0004\b\u000f\u0010\u0010JO\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fH&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001a\u0010\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager;", "", "Lu61;", "feature", "Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager$FeatureListener;", "listener", "Le5f;", "addFeatureListener", "(Lu61;Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager$FeatureListener;)V", "removeFeatureListener", "Lkotlin/Function0;", "onComplete", "Lkotlin/Function1;", "", "onError", "enableFeatureForAll", "(Lu61;Lk56;Lm56;)V", "", "Leg1;", "roles", "enableFeatureForRoles", "(Lu61;Ljava/util/Set;Lk56;Lm56;)V", "", "isFeatureEnabled", "(Lu61;)Z", "Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "getFeatureRoles", "(Lu61;)Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "FeatureListener", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface ConversationFeatureManager {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager$FeatureListener;", "", "Lu61;", "feature", "", "isEnabled", "Le5f;", "onFeatureEnabledChanged", "(Lu61;Z)V", "Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "roles", "onFeatureRolesChanged", "(Lu61;Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public interface FeatureListener {
        default void onFeatureEnabledChanged(u61 feature, boolean isEnabled) {
        }

        default void onFeatureRolesChanged(u61 feature, FeatureRoles roles) {
        }
    }

    static /* synthetic */ void enableFeatureForAll$default(ConversationFeatureManager conversationFeatureManager, u61 u61Var, k56 k56Var, m56 m56Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enableFeatureForAll");
        }
        if ((i & 2) != 0) {
            k56Var = null;
        }
        if ((i & 4) != 0) {
            m56Var = null;
        }
        conversationFeatureManager.enableFeatureForAll(u61Var, k56Var, m56Var);
    }

    static /* synthetic */ void enableFeatureForRoles$default(ConversationFeatureManager conversationFeatureManager, u61 u61Var, Set set, k56 k56Var, m56 m56Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enableFeatureForRoles");
        }
        if ((i & 4) != 0) {
            k56Var = null;
        }
        if ((i & 8) != 0) {
            m56Var = null;
        }
        conversationFeatureManager.enableFeatureForRoles(u61Var, set, k56Var, m56Var);
    }

    void addFeatureListener(u61 feature, FeatureListener listener);

    void enableFeatureForAll(u61 feature, k56 onComplete, m56 onError);

    void enableFeatureForRoles(u61 feature, Set<? extends eg1> roles, k56 onComplete, m56 onError);

    FeatureRoles getFeatureRoles(u61 feature);

    boolean isFeatureEnabled(u61 feature);

    void removeFeatureListener(u61 feature, FeatureListener listener);
}
