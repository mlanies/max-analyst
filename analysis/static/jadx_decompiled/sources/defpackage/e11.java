package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.folders.edit.FolderEditScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.main.MainScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class e11 extends p66 implements k56 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e11(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.k56
    public final Object invoke() {
        q0e q0eVar;
        Object value;
        int i = 11;
        e5f e5fVar = e5f.a;
        switch (this.a) {
            case 0:
                break;
            case 1:
                e91 e91Var = (e91) this.receiver;
                ((wr1) e91Var.X).w(ji6.c);
                do {
                    q0eVar = e91Var.t0;
                    value = q0eVar.getValue();
                } while (!q0eVar.c(value, new b91(false)));
            case 2:
                CallIncomingScreen callIncomingScreen = (CallIncomingScreen) this.receiver;
                crd crdVar = CallIncomingScreen.Z;
                eua euaVar = (eua) callIncomingScreen.o.getValue();
                String[] strArr = eua.h;
                if (!euaVar.b(strArr)) {
                    bt1 bt1Var = (bt1) callIncomingScreen.X.getValue();
                    wr1 wr1Var = (wr1) callIncomingScreen.a;
                    String str = wr1Var.k().c;
                    boolean z = wr1Var.k().h;
                    bt1Var.getClass();
                    bt1.c(bt1Var, "REQUEST_PERMISSION_MIC", str, "BEFORE_JOIN", null, null, null, z, 56);
                    eua euaVar2 = (eua) callIncomingScreen.o.getValue();
                    l5g l5gVar = (l5g) callIncomingScreen.Y.getValue();
                    int i2 = b8a.E;
                    euaVar2.getClass();
                    int i3 = j1c.permissions_audio_title;
                    int i4 = oga.g;
                    if (!eua.i(l5gVar, strArr)) {
                        euaVar2.f(l5gVar, strArr, 160);
                        break;
                    } else {
                        l5gVar.c(strArr, 160, i3, i2, i4);
                        break;
                    }
                } else {
                    callIncomingScreen.m0().q();
                    break;
                }
            case 3:
                u52 u52Var = (u52) this.receiver;
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) this.receiver;
                bc7[] bc7VarArr = ChatsListSearchScreen.J0;
                int iOrdinal = ((ov2) chatsListSearchScreen.n0().F0.a.getValue()).a.ordinal();
                if (iOrdinal != 3 && iOrdinal != 4) {
                    break;
                } else {
                    break;
                }
            case 8:
                break;
            case 9:
                break;
            case 10:
                lk3 lk3Var = (lk3) this.receiver;
                lk3Var.getClass();
                dj3 dj3Var = new dj3();
                dj3Var.c(lk3Var);
                int id = lk3Var.H0.getId();
                dj3Var.d(id, 3, 0, 3);
                dj3Var.d(id, 4, 0, 4);
                dj3Var.d(id, 6, 0, 6);
                new l2a(dj3Var, 6, id, 4).e(0);
                dj3Var.d(id, 7, 0, 7);
                new l2a(dj3Var, 7, id, 4).e(0);
                dj3Var.g(id).d.l0 = true;
                break;
            case 11:
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                break;
            case 13:
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                break;
            case 16:
                break;
            case LangUtils.HASH_SEED /* 17 */:
                lk3 lk3Var2 = (lk3) this.receiver;
                lk3Var2.getClass();
                dj3 dj3Var2 = new dj3();
                dj3Var2.c(lk3Var2);
                je7 je7Var = lk3Var2.P0;
                boolean zH = br7.H(je7Var);
                s5a s5aVar = lk3Var2.G0;
                if (zH) {
                    sh0 sh0Var = new sh0(((AppCompatCheckBox) je7Var.getValue()).getId(), 4, dj3Var2);
                    sh0Var.G(0);
                    sh0Var.e(0);
                    sh0Var.D(0);
                    sh0Var.p(s5aVar.getId());
                }
                sh0 sh0Var2 = new sh0(s5aVar.getId(), 4, dj3Var2);
                sh0Var2.G(0);
                sh0Var2.e(0);
                if (!br7.H(je7Var)) {
                    sh0Var2.D(0);
                    break;
                } else {
                    au1.p(12, fk4.d().getDisplayMetrics().density, sh0Var2.C(((AppCompatCheckBox) je7Var.getValue()).getId()));
                    break;
                }
            case 18:
                ((nr3) this.receiver).Q();
                break;
            case 19:
                ((nr3) this.receiver).Q();
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                nu5 nu5VarN0 = ((FolderEditScreen) ((jt5) this.receiver)).n0();
                nu5VarN0.B0.o1(nu5VarN0, nu5.D0[0], j47.S(nu5VarN0.a, ((w9a) nu5VarN0.o).a(), vx3.b, new fu5(nu5VarN0, null)));
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                break;
            case 25:
                MainScreen mainScreen = (MainScreen) this.receiver;
                huc hucVar = MainScreen.Z;
                t6a t6aVar = mainScreen.r0().o;
                znc zncVarP0 = mainScreen.p0();
                if (zncVarP0 != null) {
                    uu3 uu3VarG = zncVarP0.g(t6aVar.d);
                    vm9 vm9Var = uu3VarG instanceof vm9 ? (vm9) uu3VarG : null;
                    if (vm9Var != null) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 26:
                MainScreen mainScreen2 = (MainScreen) this.receiver;
                huc hucVar2 = MainScreen.Z;
                t6a t6aVar2 = mainScreen2.r0().o;
                znc zncVarP02 = mainScreen2.p0();
                if (zncVarP02 != null) {
                    uu3 uu3VarG2 = zncVarP02.g(t6aVar2.d);
                    um9 um9Var = uu3VarG2 instanceof um9 ? (um9) uu3VarG2 : null;
                    if (um9Var != null) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 27:
                MediaKeyboardWidget mediaKeyboardWidget = (MediaKeyboardWidget) this.receiver;
                ObjectAnimator objectAnimator = mediaKeyboardWidget.A0;
                if ((objectAnimator == null || !objectAnimator.isRunning()) && mediaKeyboardWidget.n0().getTranslationY() != 0.0f) {
                    ObjectAnimator objectAnimator2 = mediaKeyboardWidget.A0;
                    if (objectAnimator2 != null) {
                        objectAnimator2.cancel();
                    }
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(mediaKeyboardWidget.n0(), (Property<View, Float>) View.TRANSLATION_Y, mediaKeyboardWidget.n0().getTranslationY(), 0.0f);
                    objectAnimatorOfFloat.setDuration(200L);
                    objectAnimatorOfFloat.start();
                    mediaKeyboardWidget.A0 = objectAnimatorOfFloat;
                    break;
                }
                break;
            case 28:
                MediaKeyboardWidget mediaKeyboardWidget2 = (MediaKeyboardWidget) this.receiver;
                ObjectAnimator objectAnimator3 = mediaKeyboardWidget2.A0;
                if ((objectAnimator3 == null || !objectAnimator3.isRunning()) && mediaKeyboardWidget2.n0().getTranslationY() != mediaKeyboardWidget2.n0().getHeight()) {
                    ObjectAnimator objectAnimator4 = mediaKeyboardWidget2.A0;
                    if (objectAnimator4 != null) {
                        objectAnimator4.cancel();
                    }
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(mediaKeyboardWidget2.n0(), (Property<View, Float>) View.TRANSLATION_Y, mediaKeyboardWidget2.n0().getTranslationY(), mediaKeyboardWidget2.n0().getHeight());
                    objectAnimatorOfFloat2.setDuration(200L);
                    objectAnimatorOfFloat2.start();
                    mediaKeyboardWidget2.A0 = objectAnimatorOfFloat2;
                    break;
                }
                break;
            default:
                MessageWriteWidget messageWriteWidget = (MessageWriteWidget) this.receiver;
                bc7[] bc7VarArr2 = MessageWriteWidget.F0;
                messageWriteWidget.X.f.k = messageWriteWidget.q0().getText();
                messageWriteWidget.v0().G0.m(null, new tm9());
                break;
        }
        return e5fVar;
    }
}
