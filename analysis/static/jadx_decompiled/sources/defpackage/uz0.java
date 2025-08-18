package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;

/* loaded from: classes.dex */
public final class uz0 implements ConversationFeatureManager.FeatureListener {
    public final /* synthetic */ yz0 a;

    public uz0(yz0 yz0Var) {
        this.a = yz0Var;
    }

    @Override // ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager.FeatureListener
    public final void onFeatureEnabledChanged(u61 u61Var, boolean z) {
        Object value;
        super.onFeatureEnabledChanged(u61Var, z);
        if (u61Var != u61.b) {
            return;
        }
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "CallAdminSettingsController", ey8.j("Record in call was changed for me to ", z), null);
        }
        q0e q0eVar = this.a.E0;
        do {
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, aa.a((aa) value, false, false, false, false, z, false, 111)));
    }

    @Override // ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager.FeatureListener
    public final void onFeatureRolesChanged(u61 u61Var, FeatureRoles featureRoles) {
        Object value;
        super.onFeatureRolesChanged(u61Var, featureRoles);
        if (u61Var != u61.b) {
            return;
        }
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "CallAdminSettingsController", "Record in call was changed for role=" + featureRoles, null);
        }
        boolean z = featureRoles instanceof FeatureRoles.EnabledForAll;
        q0e q0eVar = this.a.E0;
        do {
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, aa.a((aa) value, false, false, false, false, z, false, 111)));
        Conversation conversationA = this.a.d().a();
        if (conversationA != null ? conversationA.isMeCreatorOrAdmin() : false) {
            this.a.C0.g(new cb(z));
        }
    }
}
