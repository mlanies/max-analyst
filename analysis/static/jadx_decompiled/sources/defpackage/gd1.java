package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.contactlist.ContactListWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class gd1 implements b66, t15, lfd, fn3, erd, ab3, bha, b38 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ gd1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void e() {
    }

    @Override // defpackage.bha
    public void I(CharSequence charSequence) {
        bc7[] bc7VarArr = ContactListWidget.P0;
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        contactListWidget.getClass();
        bc7[] bc7VarArr2 = ContactListWidget.P0;
        bc7 bc7Var = bc7VarArr2[7];
        contactListWidget.M0.b(contactListWidget, Boolean.TRUE);
        bc7 bc7Var2 = bc7VarArr2[5];
        contactListWidget.K0.b(contactListWidget, charSequence);
        if (contactListWidget.q0()) {
            oo3 oo3VarP0 = contactListWidget.p0();
            String string = charSequence != null ? charSequence.toString() : null;
            if (string == null) {
                string = "";
            }
            ((ti9) oo3VarP0.B0.g.getValue()).setValue(string);
        }
    }

    @Override // defpackage.bha
    public void U() {
        ((yo3) ((ContactListWidget) this.b).y0.getValue()).f(false);
    }

    @Override // defpackage.lfd
    public void X(long j, boolean z) {
        Object obj = this.b;
        switch (this.a) {
            case 2:
                bc7[] bc7VarArr = ChatNotificationsSettingsScreen.Y;
                ((im2) ((ChatNotificationsSettingsScreen) obj).b.getValue()).s(j);
                break;
            case 8:
                bc7[] bc7VarArr2 = DialogNotificationsSettingsScreen.Y;
                ((pj4) ((DialogNotificationsSettingsScreen) obj).b.getValue()).r(j);
                break;
            case 16:
                bc7[] bc7VarArr3 = MessagesSettingsScreen.Y;
                u89 u89Var = (u89) ((MessagesSettingsScreen) obj).c.getValue();
                if (j != Long.MAX_VALUE) {
                    u89Var.getClass();
                    break;
                } else {
                    ((jp) u89Var.b).j("app.messages.send.by.enter", z);
                    break;
                }
            case LangUtils.HASH_SEED /* 17 */:
                bc7[] bc7VarArr4 = NotificationsSettingsScreen.v0;
                ((NotificationsSettingsScreen) obj).m0().s(j);
                break;
            default:
                bc7[] bc7VarArr5 = OtherNotificationsSettingsScreen.Y;
                ((ina) ((OtherNotificationsSettingsScreen) obj).b.getValue()).r(j);
                break;
        }
    }

    @Override // defpackage.erd
    public void a(Object obj) {
        switch (this.a) {
            case 4:
                ((ab3) this.b).b();
                break;
            default:
                ((b38) ((g28) this.b).b).a(obj);
                break;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        i20 i20Var;
        switch (this.a) {
            case 0:
                return new sa3(2, new uh((ed1) obj, 3, (String) this.b));
            case 7:
                hy8 hy8VarA = ((iy8) ((mec) this.b).a).a();
                String str = ((kef) obj).d;
                hy8VarA.c = pag.u(str);
                hy8VarA.b = str;
                return hy8VarA.a();
            case 9:
                tp4 tp4Var = (tp4) obj;
                lp4 lp4Var = (lp4) this.b;
                ep4 ep4Var = lp4Var.a;
                fp4 fp4Var = new fp4(ep4Var.a, ep4Var.b);
                ref refVar = lp4Var.e;
                if (refVar == null) {
                    i20Var = null;
                } else {
                    i20 i20Var2 = new i20();
                    i20Var2.c = refVar.c;
                    i20Var2.b = refVar.b;
                    i20Var2.a = refVar.a;
                    i20Var2.d = refVar.d;
                    i20Var = i20Var2;
                }
                return new sa3(2, new uh(tp4Var, 5, new np4(fp4Var, lp4Var.b, lp4Var.c, lp4Var.d, i20Var)));
            case 10:
                ep4 ep4Var2 = (ep4) this.b;
                return new sa3(2, new rp4((tp4) obj, ep4Var2.a, ep4Var2.b, 0));
            case 11:
                Object[] objArr = (Object[]) obj;
                if (objArr.length == 3) {
                    return ((d66) this.b).apply(objArr[0], objArr[1], objArr[2]);
                }
                throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return ((Class) this.b).cast(obj);
            case 13:
                List list = (List) obj;
                Collections.sort(list, (Comparator) this.b);
                return list;
            case 19:
                List<h9c> list2 = (List) obj;
                ArrayList arrayList = new ArrayList();
                for (h9c h9cVar : list2) {
                    j3e j3eVar = h9cVar instanceof j3e ? (j3e) h9cVar : null;
                    Long lValueOf = j3eVar != null ? Long.valueOf(j3eVar.c) : null;
                    if (lValueOf != null) {
                        arrayList.add(lValueOf);
                    }
                }
                if (arrayList.isEmpty()) {
                    return wa3.a;
                }
                x9c x9cVar = (x9c) this.b;
                return new qa3(x9cVar.b().c(list2), 0, new sa3(1, new u9c(x9cVar, arrayList, 1)));
            case 20:
                Object objMo131apply = ((b66) ((ib3) this.b).c).mo131apply(new Object[]{obj});
                Objects.requireNonNull(objMo131apply, "The zipper returned a null value");
                return objMo131apply;
            case 21:
                return qi8.m((qi8) this.b, (fk2) obj, "@");
            case 22:
                return ((v7g) this.b).h();
            case 23:
                ((Number) obj).longValue();
                vk8 vk8Var = (vk8) this.b;
                vk8Var.getClass();
                return new q1a(1, new bqc(12, vk8Var)).m(ce.a());
            default:
                return ((aab) this.b).p((n1e) obj);
        }
    }

    @Override // defpackage.ab3
    public void b() {
        switch (this.a) {
            case 5:
                r8g r8gVar = (r8g) this.b;
                ((hc3) r8gVar.c).g();
                ((ab3) r8gVar.o).b();
                break;
            default:
                ((b38) ((g28) this.b).b).b();
                break;
        }
    }

    @Override // defpackage.erd
    public void c(zl4 zl4Var) {
        switch (this.a) {
            case 4:
                ((ab3) this.b).c(zl4Var);
                break;
            case 5:
                ((hc3) ((r8g) this.b).c).a(zl4Var);
                break;
            default:
                dm4.e((g28) this.b, zl4Var);
                break;
        }
    }

    @Override // defpackage.bha
    public void g() {
        bc7[] bc7VarArr = ContactListWidget.P0;
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        contactListWidget.getClass();
        bc7 bc7Var = ContactListWidget.P0[6];
        Boolean bool = Boolean.TRUE;
        contactListWidget.L0.b(contactListWidget, bool);
        ((bh0) contactListWidget.A0.getValue()).Y.m(null, bool);
        an9.g((an9) contactListWidget.b.getValue(), wuc.CONTACTS_SEARCH);
    }

    @Override // defpackage.t15
    public boolean h() {
        switch (this.a) {
            case 1:
                return false;
            default:
                bc7[] bc7VarArr = MessagesListWidget.X0;
                return ((l29) ((MessagesListWidget) this.b).x0().p1.getValue()).c;
        }
    }

    @Override // defpackage.lfd
    public void i(long j) {
        Object obj = this.b;
        switch (this.a) {
            case 2:
                bc7[] bc7VarArr = ChatNotificationsSettingsScreen.Y;
                ((im2) ((ChatNotificationsSettingsScreen) obj).b.getValue()).s(j);
                break;
            case 8:
                bc7[] bc7VarArr2 = DialogNotificationsSettingsScreen.Y;
                ((pj4) ((DialogNotificationsSettingsScreen) obj).b.getValue()).r(j);
                break;
            case 16:
                bc7[] bc7VarArr3 = MessagesSettingsScreen.Y;
                u89 u89Var = (u89) ((MessagesSettingsScreen) obj).c.getValue();
                if (j != Long.MAX_VALUE) {
                    u89Var.getClass();
                    if (j == 9223372036854775806L) {
                        s89.c.getClass();
                        pnf.o(u89Var.X, new c64(":stickers/settings"));
                        break;
                    }
                } else {
                    ((jp) u89Var.b).j("app.messages.send.by.enter", !r3.g.getBoolean("app.messages.send.by.enter", false));
                    u89Var.q();
                    break;
                }
                break;
            case LangUtils.HASH_SEED /* 17 */:
                bc7[] bc7VarArr4 = NotificationsSettingsScreen.v0;
                ((NotificationsSettingsScreen) obj).m0().s(j);
                break;
            default:
                bc7[] bc7VarArr5 = OtherNotificationsSettingsScreen.Y;
                ((ina) ((OtherNotificationsSettingsScreen) obj).b.getValue()).r(j);
                break;
        }
    }

    @Override // defpackage.t15
    public void j() {
        switch (this.a) {
            case 1:
                break;
            default:
                bc7[] bc7VarArr = MessagesListWidget.X0;
                ((bx) ((MessagesListWidget) this.b).x0().o).y();
                break;
        }
    }

    @Override // defpackage.t15
    public void l() {
        gi2 gi2Var;
        tf2 tf2VarX;
        int i = 1;
        int i2 = 0;
        switch (this.a) {
            case 1:
                if (!(!((lh2) ((gi2) this.b).O0.getValue()).a.isEmpty()) || (tf2VarX = (gi2Var = (gi2) this.b).x()) == null || tf2VarX.t0.b > 0) {
                    return;
                }
                e52 e52VarV = gi2Var.v();
                es8 es8Var = e52VarV != null ? e52VarV.c : null;
                Long lValueOf = es8Var != null ? Long.valueOf(es8Var.getC()) : null;
                if (lValueOf != null) {
                    long jLongValue = lValueOf.longValue();
                    hm9.m(tf2VarX.a, "loadPrev: time = %d, loadPrevOperation = %s", Long.valueOf(jLongValue), tf2VarX.t0);
                    synchronized (tf2VarX.t0) {
                        try {
                            synchronized (tf2VarX.t0) {
                            }
                            if (tf2VarX.t0.b == jLongValue) {
                                hm9.k0(tf2VarX.a, null, "loadPrev: duplicate invocation", Arrays.copyOf(new Object[0], 0));
                            } else {
                                tf2VarX.u0.a();
                                tf2VarX.t0.a();
                                tf2VarX.s0.a();
                                tf2VarX.t0.b = jLongValue;
                                ev evVar = tf2VarX.t0;
                                qa3 qa3Var = new qa3(new sa3(i2, new cv(new zu(tf2VarX, jLongValue, i2))).k(tf2VarX.c).h(tf2VarX.o), i, new av(tf2VarX, i2));
                                iq1 iq1Var = new iq1(new av(tf2VarX, i), 0, new bv(tf2VarX, i2));
                                qa3Var.i(iq1Var);
                                evVar.o = iq1Var;
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                bc7[] bc7VarArr = MessagesListWidget.X0;
                ((bx) ((MessagesListWidget) this.b).x0().o).w();
                return;
        }
    }

    @Override // defpackage.t15
    public boolean m() {
        Object obj = this.b;
        switch (this.a) {
            case 1:
                return ((lh2) ((gi2) obj).O0.getValue()).c;
            default:
                bc7[] bc7VarArr = MessagesListWidget.X0;
                return ((l29) ((MessagesListWidget) obj).x0().p1.getValue()).b;
        }
    }

    @Override // defpackage.bha
    public void n() {
        bc7[] bc7VarArr = ContactListWidget.P0;
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        uo3 uo3Var = contactListWidget.p0().b;
        uo3Var.getClass();
        ((yo3) contactListWidget.y0.getValue()).f(uo3Var == uo3.a);
    }

    @Override // defpackage.erd
    public void onError(Throwable th) {
        switch (this.a) {
            case 4:
                ((ab3) this.b).onError(th);
                break;
            case 5:
                r8g r8gVar = (r8g) this.b;
                ((hc3) r8gVar.c).g();
                ((ab3) r8gVar.o).onError(th);
                break;
            default:
                ((b38) ((g28) this.b).b).onError(th);
                break;
        }
    }

    @Override // defpackage.bha
    public void p() {
        bc7[] bc7VarArr = ContactListWidget.P0;
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        contactListWidget.getClass();
        bc7[] bc7VarArr2 = ContactListWidget.P0;
        bc7 bc7Var = bc7VarArr2[6];
        contactListWidget.L0.b(contactListWidget, Boolean.FALSE);
        bh0 bh0Var = (bh0) contactListWidget.A0.getValue();
        Boolean bool = (Boolean) contactListWidget.z0.getValue();
        bool.booleanValue();
        bh0Var.Y.m(null, bool);
        bc7 bc7Var2 = bc7VarArr2[5];
        contactListWidget.K0.b(contactListWidget, null);
        contactListWidget.p0().B0.b();
        an9.g((an9) contactListWidget.b.getValue(), wuc.CONTACTS_TAB);
    }

    @Override // defpackage.fn3
    public void v(long j) {
        ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) this.b;
        mr0.G(chatsListSearchScreen);
        bc7[] bc7VarArr = ChatsListSearchScreen.J0;
        chatsListSearchScreen.n0().u(j);
    }
}
