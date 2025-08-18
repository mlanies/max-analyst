package defpackage;

import android.os.Bundle;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;

/* loaded from: classes.dex */
public final class u71 implements b64 {
    public static final u71 a = new u71();
    public static final v71 b = v71.b;

    @Override // defpackage.b64
    public final i64 a() {
        return b;
    }

    @Override // defpackage.b64
    public final l64 b(String str, e64 e64Var, Bundle bundle) {
        k64 iVar;
        if (!b.a.contains(e64Var)) {
            return null;
        }
        v71.b.getClass();
        if (e64Var.equals(v71.c)) {
            iVar = new i(6);
        } else {
            if (!e64Var.equals(v71.d)) {
                throw new IllegalStateException(au1.f("invalid route ", e64Var));
            }
            final String string = bundle.getString("call_link");
            final String string2 = bundle.getString("call_title");
            final Long lV = i24.v("call_chat_id", bundle);
            Boolean boolU = i24.u("is_link_call", bundle);
            final boolean zBooleanValue = boolU != null ? boolU.booleanValue() : false;
            iVar = new k64() { // from class: t71
                @Override // defpackage.k64
                public final Object a() {
                    return new CallLinkInfoScreen(lV, string, string2, zBooleanValue);
                }
            };
        }
        return new l64(str, e64Var, bundle, 0, null, iVar, 24);
    }
}
