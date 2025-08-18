package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;

/* loaded from: classes.dex */
public final /* synthetic */ class oz0 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oz0(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object value;
        oa oaVar;
        xs xsVar;
        switch (this.a) {
            case 0:
                WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate = (WaitingRoomParticipantsUpdate) this.b;
                yz0 yz0Var = (yz0) this.c;
                xs xsVar2 = (xs) obj;
                List<ParticipantId> list = waitingRoomParticipantsUpdate.participantsIds;
                xs xsVar3 = new xs(0);
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    xsVar3.add(mqa.b((ParticipantId) it.next()));
                }
                if (waitingRoomParticipantsUpdate.hasAdded) {
                    ir6 ir6Var = hm9.m;
                    if (ir6Var != null && ir6Var.c()) {
                        ir6Var.d(us7.X, "CallAdminSettingsController", "Waiting room added new users=" + xsVar3, null);
                    }
                    q0e q0eVar = yz0Var.s0;
                    do {
                        value = q0eVar.getValue();
                        oaVar = (oa) value;
                        xsVar = new xs(0);
                        qs qsVar = new qs(xsVar3);
                        while (qsVar.hasNext()) {
                            Object next = qsVar.next();
                            if (!xsVar2.contains(Long.valueOf(((gg1) next).a))) {
                                xsVar.add(next);
                            }
                        }
                    } while (!q0eVar.c(value, oa.a(oaVar, null, xsVar, System.currentTimeMillis(), 1)));
                } else if (waitingRoomParticipantsUpdate.hasRemoved) {
                    ir6 ir6Var2 = hm9.m;
                    if (ir6Var2 != null && ir6Var2.c()) {
                        ir6Var2.d(us7.X, "CallAdminSettingsController", "Waiting room remove users=" + xsVar3, null);
                    }
                } else {
                    ir6 ir6Var3 = hm9.m;
                    if (ir6Var3 != null && ir6Var3.c()) {
                        ir6Var3.d(us7.X, "CallAdminSettingsController", "Waiting room update users=" + xsVar3, null);
                    }
                }
                xs xsVar4 = new xs(0);
                qs qsVar2 = new qs(xsVar3);
                while (qsVar2.hasNext()) {
                    xsVar4.add(Long.valueOf(((gg1) qsVar2.next()).a));
                }
                return xsVar4;
            case 1:
                qk5 qk5VarZ = l6d.Z(new at(2, (List) this.b), new jy2(17, (yw5) this.c));
                uw5 uw5Var = uw5.a;
                Iterator it2 = qk5VarZ.iterator();
                if (!it2.hasNext()) {
                    return wz4.a;
                }
                Object objInvoke = uw5Var.invoke(it2.next());
                if (!it2.hasNext()) {
                    return Collections.singleton(objInvoke);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(objInvoke);
                while (it2.hasNext()) {
                    linkedHashSet.add(uw5Var.invoke(it2.next()));
                }
                return linkedHashSet;
            case 2:
                x79 x79Var = (x79) this.b;
                boolean z = x79Var.b;
                return new y79(z ? 1 : 4, !z, true, z && ((e52) this.c).b.m <= 0, 0L, x79Var.a, 16);
            case 3:
                Iterator it3 = ((Set) ((x3c) this.b).c).iterator();
                while (true) {
                    boolean zHasNext = it3.hasNext();
                    Set set = (Set) this.c;
                    if (!zHasNext) {
                        return set;
                    }
                    set.add(new gza(((Number) it3.next()).longValue(), fza.a));
                }
            default:
                List list2 = (List) this.b;
                ArrayList arrayList = new ArrayList(z53.S(list2, 10));
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList.add(q5e.q((q5e) this.c, (d2e) it4.next()));
                }
                return arrayList;
        }
    }
}
