package defpackage;

import defpackage.wg0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class sx7 implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx7 b;
    public final /* synthetic */ String c;

    public /* synthetic */ sx7(yx7 yx7Var, String str, int i) {
        this.a = i;
        this.b = yx7Var;
        this.c = str;
    }

    @Override // defpackage.qj3
    public final void accept(Object obj) {
        final String str = this.c;
        yx7 yx7Var = this.b;
        switch (this.a) {
            case 0:
                sq2 sq2Var = (sq2) obj;
                yx7Var.getClass();
                List<nx8> list = sq2Var.c;
                ArrayList arrayList = new ArrayList(list.size());
                for (nx8 nx8Var : list) {
                    try {
                        fs8 fs8Var = nx8Var.b;
                        List list2 = nx8Var.o;
                        arrayList.add(new kzc(3, nx8Var.c, (ArrayList) list2, null, null, fs8Var, nx8Var.a, null));
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                yx7Var.n.addAll(arrayList);
                ArrayList arrayList2 = yx7Var.q;
                arrayList2.addAll(arrayList);
                String str2 = sq2Var.X;
                if (str2 == null || !str2.equals("0")) {
                    yx7Var.s = sq2Var.X;
                } else {
                    yx7Var.s = null;
                }
                px7 px7Var = yx7Var.i;
                if (px7Var != null) {
                    px7Var.c(str, yx7Var.n);
                    px7 px7Var2 = yx7Var.i;
                    new ArrayList(arrayList2);
                    px7Var2.getClass();
                    return;
                }
                return;
            case 1:
                final Throwable th2 = (Throwable) obj;
                yx7Var.getClass();
                hm9.p("yx7", "searchChatsAndMessages: exception", th2);
                yx7Var.g.a(new RuntimeException(str, th2) { // from class: ru.ok.tamtam.search.MainSearchLoaderImpl$NotFoundException
                    {
                        super(wg0.i("query is ", str), th2);
                    }
                });
                return;
            default:
                final Throwable th3 = (Throwable) obj;
                yx7Var.getClass();
                hm9.p("yx7", "searchChats: exception", th3);
                yx7Var.g.a(new RuntimeException(str, th3) { // from class: ru.ok.tamtam.search.MainSearchLoaderImpl$NotFoundException
                    {
                        super(wg0.i("query is ", str), th3);
                    }
                });
                return;
        }
    }
}
