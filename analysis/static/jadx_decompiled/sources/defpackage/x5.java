package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.profile.screens.addadmins.AddChatAdminsScreen;
import one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen;
import one.me.profile.screens.addmembers.AddChatMembersScreen;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;
import org.apache.http.util.LangUtils;
import ru.ok.messages.media.attaches.AudioAttachView;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.photoeditor.ActPhotoEditor;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class x5 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        int i = 5;
        pq9 pq9Var = qp4.u0;
        e5f e5fVar = e5f.a;
        final int i2 = 0;
        final int i3 = 1;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                int i4 = ActLocalMedias.s1;
                int intExtra = ((ActLocalMedias) obj).getIntent().getIntExtra("act:local_medias:chat_mode", 0);
                kl2.b.getClass();
                try {
                    return kl2.values()[intExtra];
                } catch (Throwable unused) {
                    return kl2.DEFAULT;
                }
            case 1:
                int i5 = ActPhotoEditor.Z0;
                return Boolean.valueOf(((ActPhotoEditor) obj).getIntent().getBooleanExtra("photo_editor:regular_sending", true));
            case 2:
                bc7[] bc7VarArr = AddChatAdminsScreen.x0;
                k8 k8Var = new k8(i);
                long jM0 = ((AddChatAdminsScreen) obj).m0();
                xcb xcbVar = xcb.a;
                return new ro8(k8Var, new d9(jM0, xcbVar.c(), xcbVar.getAccessor().d(u7b.class), xcbVar.d(), xcbVar.getAccessor().d(y7b.class), 0), 4);
            case 3:
                bc7[] bc7VarArr2 = AddChatMembersScreen.x0;
                int i6 = vc7.a;
                if (vc7.b(vc7.c)) {
                    mr0.G((AddChatMembersScreen) obj);
                }
                return e5fVar;
            case 4:
                bc7[] bc7VarArr3 = AddLinkBottomSheet.x0;
                khe kheVarD = f9g.a.getAccessor().d(pk7.class);
                String str = ((AddLinkBottomSheet) obj).s0.c;
                if (str == null) {
                    str = "";
                }
                return new rk7(kheVarD, str);
            case 5:
                bc7[] bc7VarArr4 = AdminWaitingRoomScreen.s0;
                AdminWaitingRoomScreen adminWaitingRoomScreen = (AdminWaitingRoomScreen) obj;
                return new ja(new ma(adminWaitingRoomScreen), ((iba) zi1.a.getAccessor().c(iba.class)).a(), new lrf(adminWaitingRoomScreen.getContext()));
            case 6:
                bc7[] bc7VarArr5 = AdminsFromContactsScreen.u0;
                bc7 bc7Var = AdminsFromContactsScreen.u0[0];
                AdminsFromContactsScreen adminsFromContactsScreen = (AdminsFromContactsScreen) obj;
                long jLongValue = ((Number) adminsFromContactsScreen.a.a(adminsFromContactsScreen)).longValue();
                xcb xcbVar2 = xcb.a;
                return new bc(jLongValue, (pb) xcbVar2.getAccessor().c(pb.class), xcbVar2.c(), xcbVar2.f());
            case 7:
                return ((yd) obj).b.getContentResolver();
            case 8:
                jz4 jz4Var = new jz4();
                jz4Var.setCallback(((zj) obj).t0);
                return jz4Var;
            case 9:
                return ((ep) obj).a();
            case 10:
                u82 u82Var = new u82();
                u82Var.e = Collections.singletonMap(1L, 1L);
                kr krVar = (kr) obj;
                e52 e52VarA = ((ma2) krVar.X.getValue()).a(0L, 2L, u82Var.b(), null, null, null);
                e52VarA.o0((el3) krVar.Z.getValue());
                return e52VarA;
            case 11:
                u82 u82Var2 = new u82();
                u82Var2.e = Collections.singletonMap(1L, 1L);
                zr zrVar = (zr) obj;
                e52 e52VarA2 = ((ma2) zrVar.Y.getValue()).a(0L, 0L, u82Var2.b(), null, null, null);
                e52VarA2.o0((el3) zrVar.s0.getValue());
                return e52VarA2;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return ((bx) obj).i.i();
            case 13:
                ix ixVar = (ix) obj;
                return new saf((ol6) ixVar.e, (mg4) ixVar.d);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                HashMap map = ((AudioAttachView) obj).v0;
                for (Map.Entry entry : map.entrySet()) {
                    ViewGroup viewGroup = (ViewGroup) entry.getKey();
                    int iIntValue = ((Number) entry.getValue()).intValue();
                    viewGroup.setClipToPadding((iIntValue & 1) != 0);
                    viewGroup.setClipChildren((iIntValue & 2) != 0);
                }
                map.clear();
                return e5fVar;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return p50.a((p50) obj);
            case 16:
                return new s50((t50) obj);
            case LangUtils.HASH_SEED /* 17 */:
                e60 e60Var = (e60) obj;
                e60Var.s0.o1(e60Var, e60.u0[0], j47.S(e60Var.o, ((w9a) e60Var.a).a(), vx3.b, new d60(e60Var, null)));
                return e5fVar;
            case 18:
                k56 k56Var = (k56) ((y7g) obj).b;
                return new od0(kt3.b((Context) k56Var.invoke(), yfa.b), j5a.a, (Context) k56Var.invoke(), new k8(15), new k8(16));
            case 19:
                return Integer.valueOf(pq9Var.j((fq0) obj).getText().j);
            case 20:
                bc7[] bc7VarArr6 = CallBottomPanelWidget.s0;
                CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) obj;
                return new h21(new l5g(callBottomPanelWidget, 1), (el1) callBottomPanelWidget.c.getValue());
            case 21:
                return new s21(lnf.a((t21) obj));
            case 22:
                z21 z21Var = (z21) obj;
                return new od0(kt3.b(z21Var.a, x7a.x), j5a.a, z21Var.a, new k8(18), new k8(19));
            case 23:
                hm9.p(((f81) obj).w0, "Didn't updated calls adapter after 5 times, too much computing!", null);
                return e5fVar;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                final d81 d81Var = (d81) obj;
                fk3 fk3Var = (fk3) d81Var.a;
                return new od0(kt3.b(fk3Var.getContext(), ytb.ic_call_24), j5a.a, fk3Var.getContext(), new m56() { // from class: c81
                    @Override // defpackage.m56
                    public final Object invoke(Object obj2) {
                        switch (i2) {
                            case 0:
                                qp4.u0.j(d81Var.a).getIcon();
                                return -1;
                            default:
                                qp4.u0.j(d81Var.a).b();
                                return 0;
                        }
                    }
                }, new m56() { // from class: c81
                    @Override // defpackage.m56
                    public final Object invoke(Object obj2) {
                        switch (i3) {
                            case 0:
                                qp4.u0.j(d81Var.a).getIcon();
                                return -1;
                            default:
                                qp4.u0.j(d81Var.a).b();
                                return 0;
                        }
                    }
                });
            case 25:
                return Boolean.valueOf(((se5) ((qe5) ((u81) obj).b.getValue())).s());
            case 26:
                crd crdVar = CallIncomingScreen.Z;
                return new l5g((CallIncomingScreen) obj, 1);
            case 27:
                Context context = ((u91) obj).a;
                kmd kmdVar = new kmd(context);
                kmdVar.c(true);
                kmdVar.b(hmd.b);
                bc7[] bc7VarArr7 = kmd.A0;
                kmdVar.w0.o1(kmdVar, bc7VarArr7[4], new float[]{0.9f, 1.1f, 0.9f});
                kmdVar.x0.o1(kmdVar, bc7VarArr7[5], 8000L);
                kmdVar.t0.o1(kmdVar, bc7VarArr7[1], new float[]{0.0f, 0.0f});
                kmdVar.v0.o1(kmdVar, bc7VarArr7[3], 0L);
                kmdVar.a(pq9Var.o(context).c);
                return kmdVar;
            case 28:
                int i7 = q7a.g;
                Context context2 = (Context) ((h7b) obj).b;
                oo7 oo7Var = new oo7(i7, pq9Var.o(context2).c.getIcon().k, context2);
                float f = 12;
                oo7Var.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                return oo7Var;
            default:
                return Long.valueOf(((hyc) ((q33) ((je7) ((vb1) obj).c.b).getValue())).t());
        }
    }
}
