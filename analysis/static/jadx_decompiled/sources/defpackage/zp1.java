package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.profile.screens.members.ChatMembersScreen;

/* loaded from: classes.dex */
public final class zp1 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zp1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                bc7[] bc7VarArr = CallWaitingRoomEventsWidget.v0;
                ((yz0) ((ez0) ((wp1) ((CallWaitingRoomEventsWidget) this.b).b.getValue()).b.getValue())).c(((tp1) ((up1) this.c)).a, !zBooleanValue);
                return e5f.a;
            case 1:
                if (((Number) obj).intValue() == 10101 && (!((Set) this.b).isEmpty())) {
                    bc7[] bc7VarArr2 = ChatMembersScreen.u0;
                    ChatMembersScreen chatMembersScreen = (ChatMembersScreen) this.c;
                    Set set = (Set) chatMembersScreen.o0().s0.a.getValue();
                    if (set == null) {
                        set = wz4.a;
                    }
                    bl2 bl2VarN0 = chatMembersScreen.n0();
                    pnf.n(bl2VarN0, ((w9a) ((kke) bl2VarN0.Y.getValue())).b(), null, new yk2(set, bl2VarN0, null), 2);
                }
                return e5f.a;
            case 2:
                nn3 nn3Var = (nn3) obj;
                if (((nx2) this.b).Q0.d(nn3Var.a) || nn3Var.v0) {
                    z = true;
                } else {
                    List list = nn3Var.o;
                    if (list != null) {
                        Long l = (Long) this.c;
                        if (!list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                long jLongValue = ((Number) it.next()).longValue();
                                if (l != null && jLongValue == l.longValue()) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 3:
                ((gh3) this.b).e((fr1) this.c);
                return e5f.a;
            case 4:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                ((AtomicBoolean) this.b).set(zBooleanValue2);
                ((p7b) ((m7b) ((je7) this.c).getValue())).a.j("app.debug.fresco", zBooleanValue2);
                ta5.a.j(zBooleanValue2 ? 2 : 6);
                return e5f.a;
            default:
                nn3 nn3Var2 = (nn3) obj;
                if (((eya) this.b).E0.d(nn3Var2.a) || nn3Var2.v0) {
                    z = true;
                } else {
                    List list2 = nn3Var2.o;
                    if (list2 != null) {
                        Long l2 = (Long) this.c;
                        if (!list2.isEmpty()) {
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                long jLongValue2 = ((Number) it2.next()).longValue();
                                if (l2 != null && jLongValue2 == l2.longValue()) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
