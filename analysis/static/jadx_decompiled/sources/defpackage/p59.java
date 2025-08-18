package defpackage;

import android.app.Application;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class p59 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;

    public /* synthetic */ p59(MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = messagesListWidget;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        boolean z = false;
        MessagesListWidget messagesListWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = MessagesListWidget.X0;
                return Boolean.valueOf(messagesListWidget.x0().A().d());
            case 1:
                bc7[] bc7VarArr2 = MessagesListWidget.X0;
                return new fn5((Application) o19.a.getAccessor().c(Application.class), new o59(messagesListWidget, 3));
            case 2:
                bc7[] bc7VarArr3 = MessagesListWidget.X0;
                return new v29(messagesListWidget.u0(), new p59(messagesListWidget, 7));
            case 3:
                bc7[] bc7VarArr4 = MessagesListWidget.X0;
                p59 p59Var = new p59(messagesListWidget, 4);
                qyc qycVar = (qyc) ((y7d) o19.a.getAccessor().c(y7d.class));
                qycVar.getClass();
                int iQ = (int) qycVar.q(PmsKey.f86msggetreactionspagesize, 40);
                return new j7b(p59Var, iQ > 0 ? iQ : 40, ((t5c) messagesListWidget.t0().q().n.getValue()).compareTo(t5c.b) >= 0, (sj3) messagesListWidget.t0().q().o.getValue());
            case 4:
                bc7[] bc7VarArr5 = MessagesListWidget.X0;
                List list = ((l29) messagesListWidget.x0().p1.getValue()).a;
                ArrayList arrayList = new ArrayList(z53.S(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((MessageModel) it.next()).b));
                }
                return arrayList;
            case 5:
                bc7[] bc7VarArr6 = MessagesListWidget.X0;
                return messagesListWidget.getRouter();
            case 6:
                bc7[] bc7VarArr7 = MessagesListWidget.X0;
                return messagesListWidget.getContext();
            case 7:
                bc7[] bc7VarArr8 = MessagesListWidget.X0;
                if ((((l29) messagesListWidget.x0().p1.getValue()).b || ((l29) messagesListWidget.x0().p1.getValue()).c) && !messagesListWidget.u0().O0()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                bc7[] bc7VarArr9 = MessagesListWidget.X0;
                messagesListWidget.getContext();
                return new MessagesLayoutManager();
            case 9:
                bc7[] bc7VarArr10 = MessagesListWidget.X0;
                n59 n59VarX0 = messagesListWidget.x0();
                e52 e52Var = (e52) n59VarX0.o1.a.getValue();
                if (e52Var != null && (n59VarX0.A().d() || !e52Var.U(((ns8) n59VarX0.F0.getValue()).g()) || !e52Var.b.g())) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 10:
                bc7[] bc7VarArr11 = MessagesListWidget.X0;
                return new m89(messagesListWidget.u0(), messagesListWidget.x0().b, messagesListWidget.x0().B().o, messagesListWidget.A0, messagesListWidget.v0());
            case 11:
                bc7[] bc7VarArr12 = MessagesListWidget.X0;
                FrameLayout frameLayout = new FrameLayout(messagesListWidget.getContext());
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return frameLayout;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                bc7[] bc7VarArr13 = MessagesListWidget.X0;
                h6c h6cVar = new h6c(messagesListWidget.getContext());
                h6cVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return h6cVar;
            default:
                bc7[] bc7VarArr14 = MessagesListWidget.X0;
                return new rg1(new khe(new p59(messagesListWidget, 5)), new l5g(messagesListWidget, 0));
        }
    }
}
