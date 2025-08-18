package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.tab.ChatsTabWidget;
import one.me.chatscreen.ChatScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.profile.screens.media.ChatMediaListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.messages.views.widgets.VideoInfoTextView;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class x2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x2(Bundle bundle, Widget widget, int i) {
        this.a = i;
        this.c = bundle;
        this.b = widget;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.k56
    public final Object invoke() {
        int i;
        String string;
        bd1 ad1Var;
        String string2;
        pq9 pq9Var = qp4.u0;
        char c = 1;
        v31 v31Var = null;
        lValueOf = null;
        Long lValueOf = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        e5f e5fVar = e5f.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = AbstractPickerScreen.s0;
                AbstractPickerScreen abstractPickerScreen = (AbstractPickerScreen) obj2;
                return new txa(abstractPickerScreen.w0((Bundle) obj), abstractPickerScreen.n0(), abstractPickerScreen.q0(), (kke) ys2.a.getAccessor().c(kke.class));
            case 1:
                f9f f9fVar = new f9f((Context) obj2);
                f9fVar.setCallback(((zj) obj).t0);
                return f9fVar;
            case 2:
                kr krVar = (kr) obj2;
                return new nn7((Context) krVar.o.getValue(), (je7) obj, (ao7) krVar.u0.getValue());
            case 3:
                zr zrVar = (zr) obj2;
                return new nn7(zrVar.t(), (je7) obj, (ao7) zrVar.B0.getValue());
            case 4:
                z7d z7dVar = ((p7b) ((m7b) ((w80) obj).b.getValue())).b;
                z7dVar.getClass();
                List listO = z7dVar.o(PmsKey.f23chatvideoautoplayparallelcount, nz4.a);
                int[] iArrC0 = listO.isEmpty() ? y7d.d : x53.C0(listO);
                if (iArrC0.length < 3) {
                    iArrC0 = y7d.d;
                }
                int iOrdinal = ((gta) obj2).a.ordinal();
                if (iOrdinal == 0) {
                    i = iArrC0[0];
                } else if (iOrdinal == 1) {
                    i = iArrC0[1];
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = iArrC0[2];
                }
                return Integer.valueOf(i);
            case 5:
                dle dleVar = (dle) obj;
                ViewGroup viewGroup = (ViewGroup) dleVar.b;
                View view = (View) ((m56) obj2).invoke((viewGroup != null ? viewGroup : null).getContext());
                dleVar.Y(view);
                return view;
            case 6:
                ((t31) obj2).i((m7) obj);
                return e5fVar;
            case 7:
                ((h61) obj2).b.c((z51) obj);
                return e5fVar;
            case 8:
                Context context = (Context) obj2;
                TextView textView = new TextView(context);
                textView.setLayoutParams(new ti3(-2, -2));
                i4f.v.b(textView, du4.b);
                textView.setTextColor(pq9Var.p(textView).c.getText().g);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setText(b8a.k0);
                Drawable drawableB = kt3.b(context, x7a.D);
                ArrayList arrayList = qqe.a;
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setVisibility(8);
                int iG = tu0.G(6 * fk4.d().getDisplayMetrics().density);
                textView.setPadding(iG, iG, iG, iG);
                tu0.K(textView, 300L, new c5(8, (h71) obj));
                return textView;
            case 9:
                crd crdVar = CallIncomingScreen.Z;
                Bundle bundle = (Bundle) obj;
                long j = bundle.getLong("call_incoming_chat_id");
                String string3 = bundle.getString("call_incoming_name", "");
                String string4 = bundle.getString("call_incoming_avatar");
                boolean z = bundle.getBoolean("call_incoming_video");
                n31 n31Var = n31.a;
                CallIncomingScreen callIncomingScreen = (CallIncomingScreen) obj2;
                return new e91(z, j, string3, string4, n31Var.b(), callIncomingScreen.a, n31Var.c(), (ida) zi1.a.getAccessor().c(ida.class), new bn1(callIncomingScreen.getContext()), (z01) n31Var.getAccessor().c(z01.class));
            case 10:
                bc7[] bc7VarArr2 = CallJoinLinkPreviewWidget.B0;
                String string5 = ((Bundle) obj).getString("call_join_link");
                if (string5 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = (CallJoinLinkPreviewWidget) obj2;
                l5g l5gVar = callJoinLinkPreviewWidget.a;
                je7 je7Var = iyc.a;
                jyc jycVar = jyc.a;
                wva wvaVar = new wva(jycVar.getAccessor().d(blb.class), jycVar.getAccessor().d(q33.class), objArr == true ? 1 : 0, 13);
                je7 je7Var2 = yi1.a;
                zi1 zi1Var = zi1.a;
                return new vb1(string5, wvaVar, l5gVar, callJoinLinkPreviewWidget.b, zi1Var.getAccessor().d(pk.class), zi1Var.getAccessor().d(cs1.class), zi1Var.getAccessor().d(kke.class), yi1.c(), zi1Var.getAccessor().d(ds3.class), zi1Var.getAccessor().d(xb9.class));
            case 11:
                CallLinkInfoScreen.B0.getClass();
                Bundle bundle2 = (Bundle) obj;
                if (bundle2 == null || (string = bundle2.getString("link_param", "")) == null) {
                    string = "";
                }
                if (bundle2 != null && bundle2.containsKey("id_param")) {
                    lValueOf = Long.valueOf(bundle2.getLong("id_param"));
                }
                if (lValueOf == null) {
                    ad1Var = new zc1(string);
                } else {
                    ad1Var = new ad1(lValueOf.longValue(), string, (bundle2 == null || (string2 = bundle2.getString("title_param", "")) == null) ? "" : string2, bundle2 != null ? bundle2.getBoolean("is_link_call") : false);
                }
                CallLinkInfoScreen callLinkInfoScreen = (CallLinkInfoScreen) obj2;
                h7b h7bVar = new h7b(callLinkInfoScreen.getContext(), 7);
                s71 s71Var = s71.a;
                khe kheVarD = s71Var.getAccessor().d(s8g.class);
                khe kheVarD2 = s71Var.getAccessor().d(hd1.class);
                khe kheVarD3 = s71Var.getAccessor().d(pk.class);
                je7 je7Var3 = callLinkInfoScreen.a;
                return new dd1(ad1Var, h7bVar, new m5d(kheVarD, kheVarD2, je7Var3, kheVarD3), new hs1(s71Var.getAccessor().d(av0.class), je7Var3), (rg1) callLinkInfoScreen.Y.getValue(), s71Var.getAccessor().d(iy2.class), s71Var.getAccessor().d(qe5.class));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                dd1 dd1Var = (dd1) obj2;
                boolean z2 = ((rc1) dd1Var.u0.a.getValue()).h;
                CharSequence charSequence = (CharSequence) obj;
                s35 s35Var = dd1Var.v0;
                if (z2) {
                    pnf.o(s35Var, new ja1(charSequence.toString()));
                } else {
                    z71 z71Var = z71.c;
                    String string6 = charSequence.toString();
                    z71Var.getClass();
                    wg0.k(":call-join-preview?link=".concat(string6), s35Var);
                }
                return e5fVar;
            case 13:
                bc7[] bc7VarArr3 = CallMoreBottomSheet.x0;
                be1 be1VarValueOf = be1.valueOf(((Bundle) obj).getString("open_type", "UNDEFINE"));
                el1 el1Var = (el1) ((CallMoreBottomSheet) obj2).s0.getValue();
                je7 je7Var4 = yi1.a;
                zi1 zi1Var2 = zi1.a;
                return new ie1(be1VarValueOf, el1Var, yi1.b(), zi1Var2.getAccessor().d(lvc.class), yi1.a(), yi1.d(), zi1Var2.getAccessor().d(ir1.class));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                bf1 bf1Var = (bf1) obj2;
                ey1 ey1Var = bf1Var.F0;
                if (ey1Var != null) {
                    bf1Var.h();
                    bc7[] bc7VarArr4 = CallOpponentsListWidget.H0;
                    CallOpponentsListWidget callOpponentsListWidget = (CallOpponentsListWidget) ey1Var.b;
                    of1 of1VarR0 = callOpponentsListWidget.r0();
                    gg1 gg1Var = (gg1) obj;
                    v31 v31VarA = of1VarR0.c.a(gg1Var, null);
                    if (v31VarA != null) {
                        ((bt1) of1VarR0.v0.getValue()).a(gg1Var.a, (LinkedHashMap) v31VarA.c);
                        v31Var = v31VarA;
                    }
                    if (v31Var != null) {
                        Point point = new Point(0, 0);
                        int[] iArr = new int[2];
                        View view2 = bf1Var.a;
                        view2.getLocationOnScreen(iArr);
                        int iQ = rh4.q(18, fk4.d().getDisplayMetrics().density, (br7.D(callOpponentsListWidget.getContext()) - iArr[0]) - (view2.getWidth() / 2));
                        int i2 = iArr[1];
                        point.x = iQ;
                        point.y = i2;
                        dy7.c(1).y().S(v31Var.a).s().L(iQ, i2).I(v31Var.b).build().q(callOpponentsListWidget);
                    }
                }
                return e5fVar;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                mm1.w((mm1) obj2, (zx7) obj);
                return e5fVar;
            case 16:
                return mn1.w((Context) obj2, (mn1) obj);
            case LangUtils.HASH_SEED /* 17 */:
                lmd lmdVar = new lmd((Context) obj2);
                kmd kmdVar = lmdVar.b;
                kmdVar.c(false);
                lmdVar.onThemeChanged(pq9Var.p((aq1) obj).c);
                imd imdVar = imd.b;
                jmd jmdVar = kmdVar.u0;
                bc7[] bc7VarArr5 = kmd.A0;
                jmdVar.o1(kmdVar, bc7VarArr5[2], imdVar);
                kmdVar.getClass();
                kmdVar.v0.o1(kmdVar, bc7VarArr5[3], Long.valueOf(MultiFileUploader.UPLOAD_NEXT_INTERVAL));
                lmdVar.o = -tu0.G(70 * fk4.d().getDisplayMetrics().density);
                return lmdVar;
            case 18:
                return new fr1((gh3) obj2, (iab) obj, 0);
            case 19:
                ((gh3) obj2).e((fh3) ((je7) obj).getValue());
                return e5fVar;
            case 20:
                ch5 ch5Var = new ch5((Context) obj2);
                ((kf2) obj).J0.addView(ch5Var);
                return ch5Var;
            case 21:
                bc7[] bc7VarArr6 = ChatMediaListWidget.s0;
                Bundle bundle3 = (Bundle) obj;
                long j2 = bundle3.getLong("chat_id");
                ih2 ih2VarO0 = ((ChatMediaListWidget) obj2).o0();
                fcb fcbVar = (fcb) xcb.a.getAccessor().c(fcb.class);
                long j3 = bundle3.getLong("chat_id");
                v4 v4Var = fcbVar.a;
                return new gi2(j2, ih2VarO0, new jf2(j3, (av0) v4Var.c(av0.class), (kke) v4Var.c(kke.class)));
            case 22:
                VideoInfoTextView videoInfoTextView = new VideoInfoTextView((Context) obj2, null, 6);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 8388693;
                float f = 4;
                layoutParams.setMarginEnd(tu0.G(fk4.d().getDisplayMetrics().density * f));
                layoutParams.bottomMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
                if (videoInfoTextView.getParent() == null) {
                    ((sg2) obj).addView(videoInfoTextView, layoutParams);
                }
                return videoInfoTextView;
            case 23:
                return new yd2((ns8) obj2, ((p7b) ((m7b) obj)).e);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                bc7[] bc7VarArr7 = ChatScreen.k1;
                int iS = au1.s(((sy8) obj2).b);
                ChatScreen chatScreen = (ChatScreen) obj;
                if (iS == 1) {
                    MessageWriteWidget messageWriteWidgetG0 = chatScreen.G0();
                    if (messageWriteWidgetG0 != null) {
                        messageWriteWidgetG0.q0().e(true);
                    }
                } else if (iS == 2) {
                    xz8.y(chatScreen.F0(), chatScreen.E0().getVisibility() == 0, false, 2);
                }
                return e5fVar;
            case 25:
                bc7[] bc7VarArr8 = ChatTitleIconScreen.z0;
                bc7 bc7Var = ChatTitleIconScreen.z0[0];
                ChatTitleIconScreen chatTitleIconScreen = (ChatTitleIconScreen) obj2;
                long[] jArr = (long[]) chatTitleIconScreen.c.a(chatTitleIconScreen);
                Object objV = ay7.v((Bundle) obj, "create_type", pyd.class);
                if (objV != null) {
                    return new ks2(jArr, (pyd) ((Parcelable) objV));
                }
                throw new IllegalArgumentException(zr6.i("No value passed for key create_type of type ", pyd.class.getSimpleName(), " in bundle").toString());
            case 26:
                s35 s35Var2 = ((nx2) obj2).O0;
                gy2 gy2Var = gy2.c;
                String str = ((aj7) ((ej7) obj)).a;
                gy2Var.getClass();
                wg0.k(":call-join-preview?link=".concat(str), s35Var2);
                return e5fVar;
            case 27:
                p82 p82VarL = ((jz2) obj2).l();
                p82VarL.getClass();
                Collection collection = (Collection) obj;
                if (collection.isEmpty()) {
                    return Collections.emptyList();
                }
                p82VarL.e();
                ConcurrentHashMap concurrentHashMap = p82VarL.g;
                if (concurrentHashMap.isEmpty()) {
                    return Collections.emptyList();
                }
                ArrayList arrayList2 = new ArrayList(collection.size());
                concurrentHashMap.forEach(new k82((Set) collection, c == true ? 1 : 0, arrayList2));
                return arrayList2;
            case 28:
                p82 p82VarL2 = ((jz2) obj2).l();
                p82VarL2.getClass();
                gi9 gi9Var = (gi9) obj;
                if (gi9Var.i()) {
                    return Collections.emptyList();
                }
                p82VarL2.e();
                ConcurrentHashMap concurrentHashMap2 = p82VarL2.g;
                if (concurrentHashMap2.isEmpty()) {
                    return Collections.emptyList();
                }
                ArrayList arrayList3 = new ArrayList(gi9Var.d);
                concurrentHashMap2.forEach(new k82(gi9Var, objArr2 == true ? 1 : 0, arrayList3));
                return arrayList3;
            default:
                bc7[] bc7VarArr9 = ChatsTabWidget.C0;
                jx5 jx5VarP0 = ((ChatsTabWidget) obj2).p0();
                j47.T(jx5VarP0.a, ((w9a) jx5VarP0.b).a(), null, new ex5(jx5VarP0, ((y5a) obj).a, null), 2);
                return e5fVar;
        }
    }

    public /* synthetic */ x2(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
