package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final /* synthetic */ class o9c implements b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p9c b;
    public final /* synthetic */ List c;

    public /* synthetic */ o9c(p9c p9cVar, List list, int i) {
        this.a = i;
        this.b = p9cVar;
        this.c = list;
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public final Object mo131apply(Object obj) {
        switch (this.a) {
            case 0:
                final d9c d9cVar = (d9c) obj;
                final p9c p9cVar = this.b;
                p9cVar.getClass();
                final ArrayList arrayList = (ArrayList) this.c;
                final int i = 2;
                return new sa3(1, new f6() { // from class: m9c
                    @Override // defpackage.f6
                    public final void run() {
                        Object obj2 = d9cVar;
                        int i2 = 0;
                        List list = arrayList;
                        p9c p9cVar2 = p9cVar;
                        switch (i) {
                            case 0:
                                p9cVar2.getClass();
                                OneMeRoomDatabase oneMeRoomDatabase = (OneMeRoomDatabase) obj2;
                                oneMeRoomDatabase.q(new v05(p9cVar2, oneMeRoomDatabase, list, 24));
                                return;
                            case 1:
                                p9cVar2.getClass();
                                ((OneMeRoomDatabase) obj2).q(new do9(p9cVar2, 25, (ArrayList) list));
                                return;
                            default:
                                long jN = ((hyc) p9cVar2.b).n();
                                ArrayList arrayList2 = new ArrayList(list.size());
                                for (int i3 = 0; i3 < list.size(); i3++) {
                                    arrayList2.add(l9c.a((h9c) list.get(i3), jN - i3));
                                }
                                d9c d9cVar2 = (d9c) obj2;
                                ilc ilcVar = d9cVar2.a;
                                ilcVar.c();
                                try {
                                    new qa3(new sa3(2, new ia4(11, d9cVar2)), i2, new sa3(2, new c9c(d9cVar2, arrayList2, i2))).a();
                                    ilcVar.r();
                                    return;
                                } finally {
                                    ilcVar.l();
                                }
                        }
                    }
                });
            case 1:
                final OneMeRoomDatabase oneMeRoomDatabase = (OneMeRoomDatabase) obj;
                final p9c p9cVar2 = this.b;
                p9cVar2.getClass();
                final List list = this.c;
                final int i2 = 0;
                return new sa3(1, new f6() { // from class: m9c
                    @Override // defpackage.f6
                    public final void run() {
                        Object obj2 = oneMeRoomDatabase;
                        int i22 = 0;
                        List list2 = list;
                        p9c p9cVar22 = p9cVar2;
                        switch (i2) {
                            case 0:
                                p9cVar22.getClass();
                                OneMeRoomDatabase oneMeRoomDatabase2 = (OneMeRoomDatabase) obj2;
                                oneMeRoomDatabase2.q(new v05(p9cVar22, oneMeRoomDatabase2, list2, 24));
                                return;
                            case 1:
                                p9cVar22.getClass();
                                ((OneMeRoomDatabase) obj2).q(new do9(p9cVar22, 25, (ArrayList) list2));
                                return;
                            default:
                                long jN = ((hyc) p9cVar22.b).n();
                                ArrayList arrayList2 = new ArrayList(list2.size());
                                for (int i3 = 0; i3 < list2.size(); i3++) {
                                    arrayList2.add(l9c.a((h9c) list2.get(i3), jN - i3));
                                }
                                d9c d9cVar2 = (d9c) obj2;
                                ilc ilcVar = d9cVar2.a;
                                ilcVar.c();
                                try {
                                    new qa3(new sa3(2, new ia4(11, d9cVar2)), i22, new sa3(2, new c9c(d9cVar2, arrayList2, i22))).a();
                                    ilcVar.r();
                                    return;
                                } finally {
                                    ilcVar.l();
                                }
                        }
                    }
                });
            default:
                final OneMeRoomDatabase oneMeRoomDatabase2 = (OneMeRoomDatabase) obj;
                final p9c p9cVar3 = this.b;
                p9cVar3.getClass();
                final ArrayList arrayList2 = (ArrayList) this.c;
                final int i3 = 1;
                return new sa3(1, new f6() { // from class: m9c
                    @Override // defpackage.f6
                    public final void run() {
                        Object obj2 = oneMeRoomDatabase2;
                        int i22 = 0;
                        List list2 = arrayList2;
                        p9c p9cVar22 = p9cVar3;
                        switch (i3) {
                            case 0:
                                p9cVar22.getClass();
                                OneMeRoomDatabase oneMeRoomDatabase22 = (OneMeRoomDatabase) obj2;
                                oneMeRoomDatabase22.q(new v05(p9cVar22, oneMeRoomDatabase22, list2, 24));
                                return;
                            case 1:
                                p9cVar22.getClass();
                                ((OneMeRoomDatabase) obj2).q(new do9(p9cVar22, 25, (ArrayList) list2));
                                return;
                            default:
                                long jN = ((hyc) p9cVar22.b).n();
                                ArrayList arrayList22 = new ArrayList(list2.size());
                                for (int i32 = 0; i32 < list2.size(); i32++) {
                                    arrayList22.add(l9c.a((h9c) list2.get(i32), jN - i32));
                                }
                                d9c d9cVar2 = (d9c) obj2;
                                ilc ilcVar = d9cVar2.a;
                                ilcVar.c();
                                try {
                                    new qa3(new sa3(2, new ia4(11, d9cVar2)), i22, new sa3(2, new c9c(d9cVar2, arrayList22, i22))).a();
                                    ilcVar.r();
                                    return;
                                } finally {
                                    ilcVar.l();
                                }
                        }
                    }
                });
        }
    }
}
