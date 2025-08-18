package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.opponent.ConfirmRemoveOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.chats.picker.contacts.ContactsPickerScreen;
import one.me.chats.tab.ChatsTabWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.profile.screens.media.ChatMediaListWidget;
import one.me.sdk.richvector.internal.element.ClipPathElement;
import org.apache.http.util.LangUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class md1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ md1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        int i;
        Set setA0;
        zh3 zh3Var;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObject = null;
        int i2 = 1;
        switch (this.a) {
            case 0:
                return nd1.a((nd1) this.b);
            case 1:
                bc7[] bc7VarArr = CallRateBottomSheet.I0;
                bc7 bc7Var = bc7VarArr[0];
                CallRateBottomSheet callRateBottomSheet = (CallRateBottomSheet) this.b;
                String str = (String) callRateBottomSheet.y0.a(callRateBottomSheet);
                bc7 bc7Var2 = bc7VarArr[1];
                boolean zBooleanValue = ((Boolean) callRateBottomSheet.z0.a(callRateBottomSheet)).booleanValue();
                bc7 bc7Var3 = bc7VarArr[2];
                return new lh1(str, zBooleanValue, (List) callRateBottomSheet.A0.a(callRateBottomSheet));
            case 2:
                return Integer.valueOf(dm1.w((dm1) this.b));
            case 3:
                bc7[] bc7VarArr2 = CallTopPanelWidget.o;
                return new sn1((el1) ((CallTopPanelWidget) this.b).a.getValue());
            case 4:
                return new b(24, (ip1) this.b);
            case 5:
                ivc ivcVar = (ivc) ((c11) this.b).b;
                return Integer.valueOf((ivcVar.f || ivcVar.e) ? 4 : 6);
            case 6:
                bc7[] bc7VarArr3 = CallWaitingRoomEventsWidget.v0;
                return new lrf(((CallWaitingRoomEventsWidget) this.b).getContext());
            case 7:
                bc7[] bc7VarArr4 = ChangeOwnerScreen.u0;
                long jM0 = ((ChangeOwnerScreen) this.b).m0();
                xcb xcbVar = xcb.a;
                return new a32(jM0, xcbVar.c(), xcbVar.e(), xcbVar.b(), xcbVar.f());
            case 8:
                return Boolean.valueOf(((se5) ((qe5) ((k52) this.b).g.getValue())).t());
            case 9:
                bc7[] bc7VarArr5 = ChatMediaDownloadBottomSheet.E0;
                a10 a10Var = new a10();
                a10Var.c = tu0.G(52 * fk4.d().getDisplayMetrics().density);
                a10Var.b = true;
                a10Var.invalidateSelf();
                ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet = (ChatMediaDownloadBottomSheet) this.b;
                fka fkaVarQ0 = chatMediaDownloadBottomSheet.q0();
                if (fkaVarQ0 == null) {
                    fkaVarQ0 = qp4.u0.b(chatMediaDownloadBottomSheet.getContext()).i();
                }
                a10Var.p.setColor(fkaVarQ0.getIcon().f);
                a10Var.invalidateSelf();
                a10Var.e = true;
                a10Var.invalidateSelf();
                return a10Var;
            case 10:
                bc7[] bc7VarArr6 = ChatMediaListWidget.s0;
                ChatMediaListWidget chatMediaListWidget = (ChatMediaListWidget) this.b;
                af2 af2Var = new af2(chatMediaListWidget.getContext());
                af2Var.setTitle(yea.r0);
                int iOrdinal = chatMediaListWidget.o0().ordinal();
                if (iOrdinal == 0) {
                    i = yfa.v;
                } else if (iOrdinal == 1) {
                    i = yfa.g;
                } else if (iOrdinal == 2) {
                    i = yfa.u;
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = yfa.w;
                }
                af2Var.setIcon(i);
                return af2Var;
            case 11:
                int iOrdinal2 = ((gi2) this.b).c.ordinal();
                if (iOrdinal2 == 0) {
                    setA0 = bcd.a0(g20.c, g20.o);
                } else if (iOrdinal2 == 1) {
                    setA0 = Collections.singleton(g20.u0);
                } else if (iOrdinal2 == 2) {
                    setA0 = Collections.singleton(g20.Z);
                } else {
                    if (iOrdinal2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    setA0 = Collections.singleton(g20.X);
                }
                ArrayList arrayList = new ArrayList(z53.S(setA0, 10));
                Iterator it = setA0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((g20) it.next()).toString());
                }
                return x53.B0(arrayList);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return Boolean.valueOf(((kl2) this.b) == kl2.c);
            case 13:
                return Integer.valueOf(qp4.u0.j((en2) this.b).getText().j);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                jr2 jr2Var = (jr2) this.b;
                int i3 = ft4.o;
                qyc qycVar = (qyc) jr2Var.b;
                qycVar.getClass();
                int iQ = (int) qycVar.q(PmsKey.f119subscriptiontimeoutseconds, 60);
                long jR = z7.R(iQ != 0 ? iQ : 60, kt4.SECONDS);
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, "jr2", "#" + jr2Var.a + " timeout = " + ft4.j(jR), null);
                }
                return new ft4(jR);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                p82 p82VarL = ((jz2) this.b).l();
                p82VarL.e();
                Long l = (Long) p82VarL.e0("getMaxLastEventTime", new b82(p82VarL, i2));
                l.longValue();
                return l;
            case 16:
                bc7[] bc7VarArr7 = ChatsTabWidget.C0;
                ((ChatsTabWidget) this.b).m0().requestDisallowInterceptTouchEvent(false);
                return e5f.a;
            case LangUtils.HASH_SEED /* 17 */:
                bc7[] bc7VarArr8 = ChatsTabWidget.C0;
                gy2.c.P1().b(":settings/folder/edit?id=".concat(((y5a) this.b).a), null);
                return e5f.a;
            case 18:
                return ClipPathElement.path_delegate$lambda$0((ClipPathElement) this.b);
            case 19:
                rme rmeVar = rme.a;
                t63 t63Var = (t63) this.b;
                return mz7.Y(new kpa(rmeVar, Integer.valueOf(t63Var.a)), new kpa(rme.b, Integer.valueOf(t63Var.b)), new kpa(rme.c, Integer.valueOf(t63Var.c)), new kpa(rme.o, Integer.valueOf(t63Var.e)), new kpa(rme.X, Integer.valueOf(t63Var.f)), new kpa(rme.Y, Integer.valueOf(t63Var.h)), new kpa(rme.Z, Integer.valueOf(t63Var.j)), new kpa(rme.s0, Integer.valueOf(t63Var.k)), new kpa(rme.t0, Integer.valueOf(t63Var.l)), new kpa(rme.u0, Integer.valueOf(t63Var.m)), new kpa(rme.v0, Integer.valueOf(t63Var.n)), new kpa(rme.w0, Integer.valueOf(t63Var.o)), new kpa(rme.x0, Integer.valueOf(t63Var.p)), new kpa(rme.y0, Integer.valueOf(t63Var.q)), new kpa(rme.z0, Integer.valueOf(t63Var.r)), new kpa(rme.A0, Integer.valueOf(t63Var.s)), new kpa(rme.B0, Integer.valueOf(t63Var.t)), new kpa(rme.C0, Integer.valueOf(t63Var.u)), new kpa(rme.D0, Integer.valueOf(t63Var.v)), new kpa(rme.E0, Integer.valueOf(t63Var.w)), new kpa(rme.F0, Integer.valueOf(t63Var.x)), new kpa(rme.G0, Integer.valueOf(t63Var.y)), new kpa(rme.H0, Integer.valueOf(t63Var.z)), new kpa(rme.I0, Integer.valueOf(t63Var.A)), new kpa(rme.J0, Integer.valueOf(t63Var.B)), new kpa(rme.K0, Integer.valueOf(t63Var.C)), new kpa(rme.L0, Integer.valueOf(t63Var.D)), new kpa(rme.M0, Integer.valueOf(t63Var.E)), new kpa(rme.N0, Integer.valueOf(t63Var.F)), new kpa(rme.O0, Integer.valueOf(t63Var.G)), new kpa(rme.P0, Integer.valueOf(t63Var.H)), new kpa(rme.Q0, Integer.valueOf(t63Var.I)), new kpa(rme.R0, Integer.valueOf(t63Var.J)), new kpa(rme.S0, Integer.valueOf(t63Var.K)), new kpa(rme.T0, t63Var.L), new kpa(rme.U0, t63Var.M), new kpa(rme.V0, t63Var.N), new kpa(rme.W0, t63Var.O), new kpa(rme.X0, t63Var.P), new kpa(rme.Y0, Integer.valueOf(t63Var.Q)), new kpa(rme.Z0, Integer.valueOf(t63Var.R)), new kpa(rme.a1, Integer.valueOf(t63Var.S)));
            case 20:
                int i4 = ConfirmAddOpponentToCallBottomSheet.A0;
                return a14.m(((ConfirmAddOpponentToCallBottomSheet) this.b).getContext());
            case 21:
                int i5 = ConfirmRemoveOpponentToCallBottomSheet.B0;
                return ((ConfirmRemoveOpponentToCallBottomSheet) this.b).getViewLifecycleScope();
            case 22:
                return Integer.valueOf(Integer.parseInt(((eh3) this.b).b));
            case 23:
                ai3 ai3Var = (ai3) this.b;
                qyc qycVar2 = (qyc) ((y7d) ai3Var.a);
                qycVar2.getClass();
                String string = qycVar2.g.getString(PmsKey.f26conntimeouts.name(), null);
                if (string != null) {
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException unused) {
                    }
                }
                khe kheVar = (khe) ai3Var.X;
                if (jSONObject == null) {
                    return (Map) kheVar.getValue();
                }
                EnumMap enumMap = new EnumMap((Map) kheVar.getValue());
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Integer numE0 = dae.e0(next);
                    if (numE0 != null && (zh3Var = (zh3) x53.j0(numE0.intValue(), zh3.s0)) != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(next)) != null && jSONArrayOptJSONArray.length() != 0) {
                        int length = jSONArrayOptJSONArray.length();
                        long[] jArr = new long[length];
                        for (int i6 = 0; i6 < length; i6++) {
                            jArr[i6] = jSONArrayOptJSONArray.optLong(i6, WorkRequest.MIN_BACKOFF_MILLIS);
                        }
                        enumMap.put((EnumMap) zh3Var, (zh3) jArr);
                    }
                }
                return enumMap;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new RippleDrawable(ColorStateList.valueOf(qp4.u0.j((lk3) this.b).d().a.a.h), null, new ColorDrawable(-1));
            case 25:
                return j1e.a((nx3) ((yn3) this.b).m.getValue());
            case 26:
                return lp3.d((lp3) this.b);
            case 27:
                return Integer.valueOf(qp4.u0.j((eq3) this.b).getText().j);
            case 28:
                bc7[] bc7VarArr9 = ContactsPickerScreen.v0;
                int i7 = vc7.a;
                if (vc7.b(vc7.c)) {
                    mr0.G((ContactsPickerScreen) this.b);
                }
                return e5f.a;
            default:
                ds3 ds3Var = (ds3) this.b;
                el3 el3Var = ds3Var.a;
                uj3 uj3VarI = el3Var.i(((p7b) el3Var.h).a.t(), false);
                return uj3VarI == null ? ds3Var.a(((Number) ds3Var.b.getValue()).longValue()) : uj3VarI;
        }
    }
}
