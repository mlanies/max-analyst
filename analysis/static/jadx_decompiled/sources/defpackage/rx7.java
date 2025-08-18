package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* loaded from: classes2.dex */
public final /* synthetic */ class rx7 implements qj3, b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx7 b;

    public /* synthetic */ rx7(yx7 yx7Var, int i) {
        this.a = i;
        this.b = yx7Var;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                yx7 yx7Var = this.b;
                yx7Var.getClass();
                yx7Var.o = ((xx7) obj).b;
                break;
            default:
                Throwable th = (Throwable) obj;
                yx7 yx7Var2 = this.b;
                yx7Var2.getClass();
                hm9.p("yx7", "searchMessages: exception", th);
                yx7Var2.g.a(th);
                break;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 2:
                yx7 yx7Var = this.b;
                upb upbVar = (upb) obj;
                yx7Var.getClass();
                List list = upbVar.c;
                List list2 = yx7Var.o;
                aq9 aq9Var = b0d.b;
                list.removeAll((List) list.stream().filter(new zzc(list2, (List) list2.stream().filter(new fl3(3)).map(new gl3(6)).collect(Collectors.toList()), (List) list2.stream().filter(new fl3(4)).map(new gl3(7)).collect(Collectors.toList()), 1)).collect(Collectors.toList()));
                int i = upbVar.o;
                Long l = upbVar.X;
                upb upbVar2 = new upb();
                upbVar2.c = list;
                upbVar2.o = i;
                upbVar2.X = l;
                return upbVar2;
            default:
                sq2 sq2Var = (sq2) obj;
                yx7 yx7Var2 = this.b;
                yx7Var2.getClass();
                List<nx8> list3 = sq2Var.c;
                ArrayList arrayList = new ArrayList(list3.size());
                for (nx8 nx8Var : list3) {
                    try {
                        fs8 fs8Var = nx8Var.b;
                        List list4 = nx8Var.o;
                        arrayList.add(new kzc(3, nx8Var.c, (ArrayList) list4, null, null, fs8Var, nx8Var.a, null));
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                String str = sq2Var.X;
                if (str == null || !str.equals("0")) {
                    yx7Var2.s = sq2Var.X;
                } else {
                    yx7Var2.s = null;
                }
                return arrayList;
        }
    }
}
