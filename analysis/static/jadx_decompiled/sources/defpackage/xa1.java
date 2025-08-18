package defpackage;

import android.content.Intent;
import android.util.Base64;
import android.view.View;
import java.nio.charset.StandardCharsets;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final /* synthetic */ class xa1 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xa1(ya1 ya1Var, y21 y21Var, boolean z) {
        this.a = 0;
        this.c = y21Var;
        this.b = z;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        e5f e5fVar = e5f.a;
        boolean z = this.b;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                Intent intent = (Intent) obj;
                intent.setAction("action-accept-call");
                y21 y21Var = (y21) obj2;
                CharSequence charSequence = y21Var.c;
                if (charSequence == null) {
                    charSequence = null;
                }
                intent.putExtra("incoming_param_name", charSequence);
                String str = y21Var.d;
                intent.putExtra("incoming_param_avatar", str != null ? Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 0) : null);
                Long l = y21Var.a;
                intent.putExtra("incoming_param_chat_id", l != null ? l.longValue() : 0L);
                intent.putExtra("incoming_param_is_video", z);
                return e5fVar;
            case 1:
                ((Boolean) obj).booleanValue();
                ((no1) obj2).G0.setVisibility(z ? 0 : 8);
                return e5fVar;
            case 2:
                bc7[] bc7VarArr = rq2.f1;
                rq2 rq2Var = (rq2) obj2;
                pnf.n(rq2Var, ((w9a) rq2Var.u()).b(), null, new pp2(rq2Var, (View) obj, z, null), 2);
                return e5fVar;
            case 3:
                kf9 kf9Var = (kf9) obj2;
                kv0 kv0Var = kf9Var.s0;
                tpa.H((y07) obj, kf9Var.o, kv0Var.a, kv0Var.b, z);
                return e5fVar;
            default:
                int iOrdinal = ((yha) obj).ordinal();
                cnb cnbVar = (cnb) obj2;
                if (iOrdinal == 0 || iOrdinal == 1) {
                    cnbVar.s();
                } else if (iOrdinal == 2) {
                    cnbVar.R0 = false;
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cnbVar.R0 = false;
                } else {
                    cnbVar.C(z);
                }
                return e5fVar;
        }
    }

    public /* synthetic */ xa1(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }
}
