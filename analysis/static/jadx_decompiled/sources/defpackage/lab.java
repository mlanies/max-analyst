package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.animation.PathInterpolator;
import java.util.HashMap;
import java.util.Iterator;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import org.apache.http.util.LangUtils;
import org.json.JSONObject;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class lab implements k56 {
    public final /* synthetic */ int a;

    public /* synthetic */ lab(int i) {
        this.a = i;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        String strOptString;
        String strOptString2;
        switch (this.a) {
            case 0:
                xcb xcbVar = xcb.a;
                return new n1d(xcbVar.getAccessor().d(ida.class), xcbVar.getAccessor().d(zua.class), xcbVar.d(), xcbVar.getAccessor().d(y7d.class));
            case 1:
                return new mg3(wea.y, new eqe(yea.X), 3, false);
            case 2:
                return new l7a(wea.H0, Integer.valueOf(yea.p), (Integer) null, Integer.valueOf(woc.c), (Integer) null, 52);
            case 3:
                return new l7a(wea.M0, Integer.valueOf(yea.u), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P), 32);
            case 4:
                return new l7a(wea.O0, Integer.valueOf(yea.w), Integer.valueOf(wfa.U), Integer.valueOf(woc.C), Integer.valueOf(wfa.P), 32);
            case 5:
                return new l7a(wea.N0, Integer.valueOf(yea.v), Integer.valueOf(wfa.U), Integer.valueOf(woc.C), Integer.valueOf(wfa.P), 32);
            case 6:
                return new l7a(wea.N0, Integer.valueOf(yea.z), Integer.valueOf(wfa.U), Integer.valueOf(woc.C), Integer.valueOf(wfa.P), 32);
            case 7:
                return new tt3(wea.s0, new eqe(yea.X1), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P));
            case 8:
                kl7 kl7VarL = j1e.l();
                kl7VarL.add(new tt3(wea.a1, new eqe(yea.E2), Integer.valueOf(woc.B1), (Integer) null, 20));
                kl7VarL.add(new tt3(wea.Z0, new eqe(yea.D2), Integer.valueOf(woc.o2), (Integer) null, 20));
                kl7VarL.add(new tt3(wea.b1, new eqe(yea.F2), Integer.valueOf(woc.A1), (Integer) null, 20));
                kl7VarL.add(new tt3(wea.Y0, new eqe(yea.C2), Integer.valueOf(woc.q), (Integer) null, 20));
                return j1e.d(kl7VarL);
            case 9:
                return new l7a(wea.J0, Integer.valueOf(yea.r), (Integer) null, Integer.valueOf(woc.C0), (Integer) null, 52);
            case 10:
                return new l7a(wea.P0, Integer.valueOf(yea.x), (Integer) null, Integer.valueOf(woc.N0), (Integer) null, 52);
            case 11:
                return new l7a(wea.Q0, Integer.valueOf(yea.y), Integer.valueOf(wfa.U), Integer.valueOf(woc.p1), Integer.valueOf(wfa.P), 32);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new l7a(wea.I0, Integer.valueOf(yea.q), Integer.valueOf(wfa.U), Integer.valueOf(woc.e0), Integer.valueOf(wfa.P), 32);
            case 13:
                return new l7a(wea.L0, Integer.valueOf(yea.t), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P), 32);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new l7a(wea.K0, Integer.valueOf(yea.s), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P), 32);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new mge(0);
            case 16:
                return new mge(0);
            case LangUtils.HASH_SEED /* 17 */:
                bc7[] bc7VarArr = ProfileEditAdminPermissionsWidget.x0;
                return Boolean.valueOf(((se5) ((qe5) neb.a.getAccessor().d(qe5.class).getValue())).t());
            case 18:
                return (dfb) neb.a.getAccessor().c(dfb.class);
            case 19:
                bc7[] bc7VarArr2 = ProfileInviteScreen.Y;
                return wuc.CHAT_INFO_INVITE_LINK;
            case 20:
                bc7[] bc7VarArr3 = ProfileScreen.D0;
                return wuc.CHAT_INFO;
            case 21:
                return new zcb();
            case 22:
                return new gcb();
            case 23:
                return new ejb();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
            case 25:
                bc7[] bc7VarArr4 = b6c.B0;
                return e5f.a;
            case 26:
                JSONObject jSONObject = new JSONObject();
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject != null) {
                        try {
                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("emoji");
                            ox4 ox4Var = null;
                            ox4 ox4Var2 = (jSONObjectOptJSONObject2 == null || (strOptString = jSONObjectOptJSONObject2.optString("url")) == null) ? null : new ox4(jSONObjectOptJSONObject2, strOptString);
                            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("reactionAction");
                            if (jSONObjectOptJSONObject3 != null && (strOptString2 = jSONObjectOptJSONObject3.optString("url")) != null) {
                                ox4Var = new ox4(jSONObjectOptJSONObject3, strOptString2);
                            }
                            px4 px4Var = new px4(next, ox4Var2, ox4Var);
                            if (ox4Var2 != null || ox4Var != null) {
                                map.put(next, px4Var);
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
                yb9 yb9Var = new yb9();
                map.size();
                return yb9Var;
            case 27:
                return ((w9a) o19.a.getDispatchers()).b();
            case 28:
                bc7[] bc7VarArr5 = RecordControlsWidget.b1;
                return new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
            default:
                bc7[] bc7VarArr6 = RecordControlsWidget.b1;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                return gradientDrawable;
        }
    }
}
