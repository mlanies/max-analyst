package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class mp3 extends gle {
    public final /* synthetic */ int c;
    public Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mp3(gy8 gy8Var, int i) {
        super(gy8Var);
        this.c = i;
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        ArrayList arrayList;
        int i = 0;
        switch (this.c) {
            case 0:
                str.getClass();
                if (str.equals("contactIds")) {
                    this.o = new ArrayList();
                    int iG = lz7.G(gy8Var);
                    while (i < iG) {
                        ((List) this.o).add(Long.valueOf(gy8Var.w0()));
                        i++;
                    }
                    break;
                } else {
                    gy8Var.z();
                    break;
                }
            case 1:
                str.getClass();
                if (str.equals("mentions")) {
                    this.o = wz.e(gy8Var);
                    break;
                } else {
                    gy8Var.z();
                    break;
                }
            case 2:
                str.getClass();
                if (str.equals("locations")) {
                    LinkedHashMap linkedHashMap = null;
                    if (gy8Var.n().a() == 8) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        int iX0 = gy8Var.x0();
                        for (int i2 = 0; i2 < iX0; i2++) {
                            Long lValueOf = Long.valueOf(lz7.M(gy8Var, 0L));
                            if (gy8Var.n().a() == 7) {
                                arrayList = new ArrayList();
                                int iS0 = gy8Var.s0();
                                for (int i3 = 0; i3 < iS0; i3++) {
                                    arrayList.add(fr7.a(gy8Var));
                                }
                            } else {
                                gy8Var.z();
                                arrayList = null;
                            }
                            linkedHashMap2.put(lValueOf, arrayList);
                        }
                        linkedHashMap = linkedHashMap2;
                    } else {
                        gy8Var.z();
                    }
                    this.o = linkedHashMap;
                    break;
                } else {
                    gy8Var.z();
                    break;
                }
            default:
                str.getClass();
                if (str.equals("stats")) {
                    this.o = new HashMap();
                    int iN = lz7.N(gy8Var);
                    while (i < iN) {
                        ((Map) this.o).put(Long.valueOf(gy8Var.w0()), ux8.a(gy8Var));
                        i++;
                    }
                    break;
                } else {
                    gy8Var.z();
                    break;
                }
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        switch (this.c) {
            case 0:
                return wg0.g(s5c.o((List) this.o), "{contactIds=", "}");
            case 1:
                return wg0.g(s5c.o((wz) this.o), "Response{mentions=", "}");
            case 2:
                return "Response{locations=" + ((LinkedHashMap) this.o) + "}";
            default:
                return wg0.g(s5c.S((Map) this.o), "{stats=", "}");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp3(gy8 gy8Var) {
        super(gy8Var);
        this.c = 3;
        if (((Map) this.o) == null) {
            this.o = Collections.emptyMap();
        }
    }
}
