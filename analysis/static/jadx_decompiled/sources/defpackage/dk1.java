package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import java.util.concurrent.CopyOnWriteArraySet;
import one.me.calls.impl.service.CallServiceImpl;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.profile.screens.members.ChatAdminsScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class dk1 implements k56 {
    public final /* synthetic */ int a;

    public /* synthetic */ dk1(int i) {
        this.a = i;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        int i = 6;
        switch (this.a) {
            case 0:
                return new ugf(n31.a.getAccessor().d(kr1.class));
            case 1:
                return new en1();
            case 2:
                hl1 hl1Var = CallServiceImpl.s0;
                return (vs1) n31.a.getAccessor().c(vs1.class);
            case 3:
                hl1 hl1Var2 = CallServiceImpl.s0;
                return n31.a.d();
            case 4:
                hl1 hl1Var3 = CallServiceImpl.s0;
                return n31.a.b();
            case 5:
                hl1 hl1Var4 = CallServiceImpl.s0;
                return (xuc) n31.a.getAccessor().c(xuc.class);
            case 6:
                hl1 hl1Var5 = CallServiceImpl.s0;
                return (eua) n31.a.getAccessor().c(eua.class);
            case 7:
                hl1 hl1Var6 = CallServiceImpl.s0;
                return (q71) n31.a.getAccessor().c(q71.class);
            case 8:
                float f = fk4.d().getDisplayMetrics().density * 40.0f;
                return new float[]{f, f, f, f, f, f, f, f};
            case 9:
                return new m1b();
            case 10:
                return new u31();
            case 11:
                int i2 = mn1.V0;
                return -231920335;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return Boolean.valueOf(((se5) ((qe5) ((khe) yi1.d()).getValue())).s());
            case 13:
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-869546428);
                shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
                shapeDrawable.getPaint().setStrokeWidth(fk4.d().getDisplayMetrics().density * 4.0f);
                shapeDrawable.getPaint().setAntiAlias(true);
                return new InsetDrawable((Drawable) shapeDrawable, tu0.G(2 * fk4.d().getDisplayMetrics().density));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                float f2 = fk4.d().getDisplayMetrics().density * 20.0f;
                return new float[]{f2, f2, f2, f2, f2, f2, f2, f2};
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return (era) n31.a.getAccessor().c(era.class);
            case 16:
                bc7[] bc7VarArr = CallWaitingRoomEventsWidget.v0;
                return new wp1(yi1.b(), yi1.a(), zi1.a.getAccessor().d(kke.class));
            case LangUtils.HASH_SEED /* 17 */:
                return new rq1();
            case 18:
                return lld.a(1, 1, 2);
            case 19:
                return new CopyOnWriteArraySet();
            case 20:
                return new CopyOnWriteArraySet();
            case 21:
                return y53.M(":call-active", ":call-answer", ":call-user", ":call-chat", ":call-join-link");
            case 22:
                return Integer.valueOf(rub.ic_call_16);
            case 23:
                return Integer.valueOf(rub.ic_video_16);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new f22();
            case 25:
                bc7[] bc7VarArr2 = ChangeOwnerScreen.u0;
                return wuc.CHAT_INFO_CHANGE_OWNER;
            case 26:
                bc7[] bc7VarArr3 = ChangeOwnerScreen.u0;
                return new ro8(new we1(i), (d9) null, 6);
            case 27:
                return new mg3(p8a.R, new eqe(r8a.n), 2, false);
            case 28:
                bc7[] bc7VarArr4 = ChatAdminsScreen.w0;
                return wuc.CHAT_INFO_ADMINISTRATORS;
            default:
                bc7[] bc7VarArr5 = ChatAdminsScreen.w0;
                return Boolean.valueOf(((se5) ((qe5) xcb.a.g().getValue())).t());
        }
    }
}
