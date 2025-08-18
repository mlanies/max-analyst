package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* loaded from: classes2.dex */
public final class xje implements qj3 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ xje() {
        this.a = 0;
    }

    public void a(EventItemsMap eventItemsMap) {
        int i = zxe.$EnumSwitchMapping$0[((xxe) ((k56) this.b).invoke()).ordinal()];
        eventItemsMap.set("call_topology", i != 1 ? i != 2 ? "?" : "D" : "S");
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        fg1 fg1Var;
        bg1 bg1Var;
        switch (this.a) {
            case 2:
                ((UploadFileAttachWorker) this.b).g((ly8) obj);
                break;
            default:
                od odVar = (od) this.b;
                if (odVar.a) {
                    ((a4c) odVar.b).log("OwnTalkingReporter", "on voice stop detected and reported");
                    ync yncVar = (ync) odVar.Y;
                    if (yncVar != null) {
                        kg1 kg1Var = (kg1) yncVar.b;
                        fg1 fg1Var2 = kg1Var.a;
                        boolean zD = fg1Var2.d();
                        fg1Var2.n = false;
                        if (zD != fg1Var2.d() && (bg1Var = (fg1Var = kg1Var.a).a) != null) {
                            kg1Var.e(kg1Var.c(bg1Var), Collections.singletonList(fg1Var));
                        }
                    }
                    odVar.a = false;
                    break;
                }
                break;
        }
    }

    public qnf b(h23 h23Var) {
        String str;
        Class cls = h23Var.a;
        String canonicalName = null;
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            HashMap map = h23.c;
            if (zIsArray) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) map.get(componentType.getName())) != null) {
                    canonicalName = str.concat("Array");
                }
                if (canonicalName == null) {
                    canonicalName = "kotlin.Array";
                }
            } else {
                canonicalName = (String) map.get(cls.getName());
                if (canonicalName == null) {
                    canonicalName = cls.getCanonicalName();
                }
            }
        }
        if (canonicalName != null) {
            return ((k8g) this.b).s(h23Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public void c(b9b b9bVar) {
        moa moaVar = (moa) this.b;
        moaVar.a = b9bVar;
        Iterator it = ((LinkedList) moaVar.c).iterator();
        while (it.hasNext()) {
            ((neg) it.next()).b();
        }
        ((LinkedList) moaVar.c).clear();
        moaVar.b = null;
    }

    public /* synthetic */ xje(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xje(xnf xnfVar, vnf vnfVar) {
        this(xnfVar, vnfVar, jz3.b);
        this.a = 3;
    }

    public xje(xnf xnfVar, vnf vnfVar, lz3 lz3Var) {
        this.a = 3;
        this.b = new k8g(xnfVar, vnfVar, lz3Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public xje(ynf ynfVar) {
        vnf vnfVarO;
        lz3 lz3VarP;
        this.a = 3;
        xnf xnfVarW = ynfVar.w();
        boolean z = ynfVar instanceof pi6;
        if (z) {
            vnfVarO = ((pi6) ynfVar).o();
        } else {
            vnfVarO = sf4.a;
        }
        if (z) {
            lz3VarP = ((pi6) ynfVar).p();
        } else {
            lz3VarP = jz3.b;
        }
        this(xnfVarW, vnfVarO, lz3VarP);
    }
}
