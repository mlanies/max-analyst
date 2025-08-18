package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.contactlist.ContactListWidget;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.members.list.MembersListWidget;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class ga implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ga(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        String str;
        Context context;
        Set set;
        boolean zContains = false;
        int i = 1;
        wnc wncVar = null;
        e5f e5fVar = e5f.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                ((ia) obj3).c(((z9f) ((ol7) obj2)).o, !((Boolean) obj).booleanValue());
                return e5fVar;
            case 1:
                zj zjVar = (zj) obj3;
                hm9.p(zjVar.s0, "fail to load static image", (Throwable) obj);
                zjVar.e(uj.a);
                ((f9f) obj2).c = null;
                return e5fVar;
            case 2:
                l20 l20Var = (l20) obj;
                g20 g20Var = l20Var.a;
                g20 g20Var2 = g20.o;
                ld2 ld2Var = (ld2) obj3;
                Context context2 = ld2Var.a;
                je7 je7Var = ld2Var.f;
                es8 es8Var = (es8) obj2;
                if (g20Var == g20Var2) {
                    boolean z = l20Var.d.b == 2;
                    Uri uriA = ((o20) ((t00) je7Var.getValue())).a(l20Var);
                    f9f f9fVar = uriA != null ? new f9f(context2, ((o20) ((t00) je7Var.getValue())).c(l20Var, s5c.U(l20Var, es8Var)), uriA.toString()) : null;
                    if (f9fVar != null) {
                        if (z) {
                            wncVar = new wnc();
                            wncVar.b = true;
                        }
                        rq4 rq4Var = f9fVar.a.o;
                        rq4Var.getClass();
                        ((la6) rq4Var).n(wncVar);
                    }
                    return new LayerDrawable(new Drawable[]{f9fVar, new InsetDrawable((Drawable) ld2Var.r.getValue(), z ? 0.25f : 0.1f)});
                }
                if (g20Var != g20.Y) {
                    Uri uriA2 = ((o20) ((t00) je7Var.getValue())).a(l20Var);
                    if (uriA2 != null) {
                        return new f9f(context2, ((o20) ((t00) je7Var.getValue())).c(l20Var, s5c.U(l20Var, es8Var)), uriA2.toString());
                    }
                    return null;
                }
                f20 f20VarJ = es8Var.a.j();
                if (f20VarJ != null) {
                    str = f20VarJ.h;
                    if (oag.t(str)) {
                        str = f20VarJ.b;
                    }
                } else {
                    str = null;
                }
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                f9f f9fVar2 = new f9f(context2);
                f9fVar2.c(null, str);
                return f9fVar2;
            case 3:
                ((m56) obj3).invoke(((CharSequence) obj).toString());
                ((pl2) obj2).E(null);
                return e5fVar;
            case 4:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue < 0) {
                    bc7[] bc7VarArr = ChatNotificationsSettingsScreen.Y;
                    return null;
                }
                mfd mfdVar = ((ChatNotificationsSettingsScreen) obj3).c;
                if (iIntValue >= mfdVar.j() || ((kfd) ((ol7) mfdVar.C(iIntValue))).getItemId() != dea.f) {
                    return null;
                }
                return z7.B(((EndlessRecyclerView2) obj2).getContext(), eea.b).toUpperCase(Locale.ROOT);
            case 5:
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) obj3;
                int iL = chatsListSearchScreen.F0.l(((Integer) obj).intValue());
                EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) obj2;
                if (iL == z8a.m) {
                    return endlessRecyclerView2.getResources().getString(yoc.A0);
                }
                if (iL == z8a.s) {
                    return endlessRecyclerView2.getResources().getString(yoc.C0);
                }
                if (iL == p8a.m) {
                    if (chatsListSearchScreen.x0.j() == 0) {
                        return endlessRecyclerView2.getResources().getString(r8a.x);
                    }
                    return null;
                }
                if (iL == p8a.p) {
                    return endlessRecyclerView2.getResources().getString(yoc.B0);
                }
                if (iL == p8a.r) {
                    return endlessRecyclerView2.getResources().getString(r8a.z);
                }
                return null;
            case 6:
                if (lw2.$EnumSwitchMapping$0[((yha) obj).ordinal()] == 1) {
                    nx2 nx2Var = (nx2) obj3;
                    nx2Var.T0.o1(nx2Var, nx2.X0[0], pnf.n(nx2Var, ((w9a) nx2Var.Y).b(), null, new mx2(nx2Var, ((uj3) obj2).n(), null), 2));
                }
                return e5fVar;
            case 7:
                ChatsListWidget chatsListWidget = (ChatsListWidget) obj3;
                if (((Integer) obj).intValue() != chatsListWidget.A0.j() + chatsListWidget.B0.j() || chatsListWidget.C0.j() <= 0) {
                    return null;
                }
                return ((nn3) obj2).b;
            case 8:
                long jLongValue = ((Long) obj).longValue();
                fn3 fn3Var = (fn3) ((a3g) obj2).Y;
                nn3 nn3Var = (nn3) obj3;
                if (nn3Var.v0) {
                    fn3Var.N();
                } else if (nn3Var.Y != null) {
                    fn3Var.d(jLongValue);
                } else {
                    fn3Var.v(jLongValue);
                }
                return e5fVar;
            case 9:
                pua puaVar = (pua) obj;
                if (!((Set) obj3).contains(puaVar) && !c54.O(puaVar).contains(Long.valueOf(((uj3) obj2).o()))) {
                    zContains = true;
                }
                return Boolean.valueOf(zContains);
            case 10:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((a66) obj3).invoke(Long.valueOf(((nn3) obj2).a), bool);
                return e5fVar;
            case 11:
                int iIntValue2 = ((Integer) obj).intValue();
                bc7[] bc7VarArr2 = ContactListWidget.P0;
                ContactListWidget contactListWidget = (ContactListWidget) obj3;
                CharSequence charSequenceN0 = contactListWidget.n0();
                if (charSequenceN0 == null || charSequenceN0.length() == 0) {
                    return null;
                }
                int iL2 = contactListWidget.v0.l(iIntValue2);
                RecyclerView recyclerView = (RecyclerView) obj2;
                if (iL2 == z8a.m) {
                    return recyclerView.getResources().getString(yoc.z0);
                }
                if (iL2 == z8a.p) {
                    return recyclerView.getResources().getString(yoc.B0);
                }
                return null;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                Double d = (Double) obj;
                kk4 kk4Var = (kk4) obj3;
                kg1 kg1Var = kk4Var.v0;
                Collection collectionI = kg1Var.i();
                HashMap map = new HashMap(collectionI.size());
                Iterator it = collectionI.iterator();
                while (it.hasNext()) {
                    map.put(((fg1) it.next()).a, Float.valueOf(d.floatValue()));
                }
                map.put(kg1Var.a.a, Float.valueOf(d.floatValue()));
                co9 co9Var = new co9(map);
                ((sf0) obj2).b(kk4Var.Y, "DirectCallTopology", "send 'virtual' NetworkStatusNotification: " + co9Var);
                kk4Var.R0.b(co9Var);
                return e5fVar;
            case 13:
                xg1 xg1Var = (xg1) obj2;
                ((Boolean) obj).getClass();
                cb5 cb5Var = (cb5) obj3;
                w4d w4dVar = cb5Var.h;
                bc7[] bc7VarArr3 = cb5.i;
                x77 x77Var = (x77) w4dVar.T0(cb5Var, bc7VarArr3[0]);
                if (x77Var != null) {
                    x77Var.cancel(null);
                }
                cb5Var.h.o1(cb5Var, bc7VarArr3[0], null);
                cb5Var.b().c = null;
                try {
                    xg1 xg1Var2 = cb5Var.g;
                    WindowManager windowManagerZ = (xg1Var2 == null || (context = xg1Var2.getContext()) == null) ? null : nd7.z(context);
                    if (windowManagerZ != null) {
                        windowManagerZ.removeView(xg1Var);
                    }
                } catch (IllegalArgumentException e) {
                    hm9.p("FakePipController", "can't hide call local pip", e);
                }
                cb5Var.g = null;
                return e5fVar;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((a66) obj3).invoke((rd6) obj2, bool2);
                return e5fVar;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((wh6) obj3).a.removeCallbacks((Runnable) obj2);
                return e5fVar;
            case 16:
                bc7[] bc7VarArr4 = InputPhoneScreen.E0;
                mr0.I((cla) obj3);
                q27 q27VarQ0 = ((InputPhoneScreen) obj2).q0();
                q27VarQ0.getClass();
                du7.c.getClass();
                pnf.o(q27VarQ0.Y, new c64(":webview/faq"));
                return e5fVar;
            case LangUtils.HASH_SEED /* 17 */:
                ((Long) obj).getClass();
                fo8 fo8Var = (fo8) ((a3g) obj2).Y;
                kn8 kn8Var = (kn8) obj3;
                if (kn8Var.s0) {
                    pnf.o(((MembersListWidget) fo8Var).o0().X, po8.a);
                } else {
                    boolean z2 = kn8Var.t0;
                    long j = kn8Var.a;
                    if (z2) {
                        ro8 ro8VarO0 = ((MembersListWidget) fo8Var).o0();
                        ro8VarO0.getClass();
                        pnf.o(ro8VarO0.X, new oo8(j));
                    } else {
                        ((MembersListWidget) fo8Var).o0().t(j, kn8Var.v0);
                    }
                }
                return e5fVar;
            case 18:
                Integer num = (Integer) obj;
                num.getClass();
                bc7[] bc7VarArr5 = MembersListWidget.D0;
                kn8 kn8Var2 = (kn8) ((m56) obj3).invoke(num);
                if (kn8Var2 != null && (set = (Set) ((MembersListWidget) obj2).o0().Z.getValue()) != null && set.contains(Long.valueOf(kn8Var2.a)) && kn8Var2.v0) {
                    zContains = true;
                }
                return Boolean.valueOf(zContains);
            case 19:
                dk2 dk2Var = (dk2) obj;
                if (dk2Var.a.a != ((hyc) ((jq8) obj3).Y).t() && ((cu8) obj2).o <= dk2Var.c) {
                    zContains = true;
                }
                return Boolean.valueOf(zContains);
            case 20:
                ol7 ol7Var = (ol7) ((MessageContextMenuBottomSheet) obj3).W0.C(((Integer) obj).intValue());
                if ((ol7Var instanceof jn8) && ((jn8) ol7Var).t0) {
                    return ((RecyclerView) obj2).getContext().getString(oda.p0);
                }
                return null;
            case 21:
                ((aj9) obj3).e(((zi9) obj2).b);
                return e5fVar;
            case 22:
                Continuation continuation = (Continuation) obj;
                yx9 yx9Var = (yx9) obj3;
                yx9Var.getClass();
                List<wd5> list = (List) obj2;
                ArrayList arrayList = new ArrayList(z53.S(list, 10));
                for (wd5 wd5Var : list) {
                    arrayList.add(wd5Var.a + "_" + wd5Var.b);
                }
                return ote.j(yx9Var.a, new xx9(yx9Var, arrayList, i), continuation);
            case 23:
                iba ibaVar = (iba) obj3;
                eba ebaVarB = ibaVar.b();
                ebaVarB.getClass();
                dba dbaVar = new dba();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                x45 x45Var = (x45) obj2;
                Integer numValueOf = Integer.valueOf(x45Var.g);
                bkb bkbVar = ebaVarB.a;
                String str2 = x45Var.a;
                ThreadFactory threadFactoryS = bkbVar.s(str2, numValueOf);
                int i2 = x45Var.b;
                int i3 = x45Var.c;
                long j2 = x45Var.d;
                tk5 tk5Var = new tk5(i2, i3, j2, timeUnit, dbaVar, threadFactoryS);
                if (x45Var.e && j2 > 0) {
                    tk5Var.allowCoreThreadTimeOut(true);
                }
                tk5Var.setRejectedExecutionHandler(new qw1(1));
                if (x45Var.f) {
                    tk5Var.prestartAllCoreThreads();
                }
                return ibaVar.i(tk5Var, str2);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                if (((SharedPreferences) ((je7) ((adb) obj3).b).getValue()).getString((String) obj2, null) == null) {
                    return null;
                }
                throw new jr9("An operation is not implemented: ONEME-18754 Добавить поддержку кастомных тем");
            case 25:
                int iIntValue3 = ((Integer) obj).intValue();
                bc7[] bc7VarArr6 = PickerMembersListWidget.x0;
                hdc adapter = ((EndlessRecyclerView2) obj3).getAdapter();
                PickerMembersListWidget pickerMembersListWidget = (PickerMembersListWidget) obj2;
                nxa nxaVar = pickerMembersListWidget.Y;
                if (adapter != nxaVar) {
                    nxaVar = pickerMembersListWidget.Z;
                }
                if (nxaVar.j() > iIntValue3 && iIntValue3 >= 0) {
                    zContains = ((Set) pickerMembersListWidget.o0().Z.a.getValue()).contains(Long.valueOf(((pxa) ((ol7) nxaVar.C(iIntValue3))).a));
                }
                return Boolean.valueOf(zContains);
            case 26:
                return ((v6b) ((t6b) obj3).b.getValue()).a(null, (cu8) obj2);
            case 27:
                ktc ktcVar = (ktc) obj;
                if (ktcVar instanceof itc) {
                    sj3 sj3Var = (sj3) obj3;
                    if (sj3Var != null) {
                        sj3Var.accept(((itc) ktcVar).a);
                    }
                } else {
                    if (!(ktcVar instanceof jtc)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((sj3) obj2).accept(ktcVar);
                }
                return e5fVar;
            case 28:
                ((ChatsListSearchScreen) ((tyc) ((xq3) obj3).Y)).o0((izc) obj2);
                return e5fVar;
            default:
                nzc nzcVar = (nzc) obj3;
                w6b w6bVarH = nzcVar.b.h((String) obj);
                return new w6b(ema.v(qp4.u0.b(nzcVar.a).i(), w6bVarH, ema.s(w6bVarH.a.toString(), ((kzc) obj2).c)), w6bVarH.b);
        }
    }
}
