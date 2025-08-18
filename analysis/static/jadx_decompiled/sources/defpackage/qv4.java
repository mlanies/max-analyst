package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.photoeditor.view.BrushWidthViewImpl;

/* loaded from: classes2.dex */
public final class qv4 implements tv4 {
    public final uv4 a;
    public zva b;
    public imc c;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f = -65536;
    public float g = 24.0f;
    public boolean h = false;

    public qv4(uv4 uv4Var) {
        this.a = uv4Var;
        uv4Var.setListener(this);
    }

    public final ov4 a() {
        Integer num;
        uv4 uv4Var = this.a;
        List<nv4> layers = uv4Var.getLayers();
        ArrayList arrayList = this.d;
        Rect bounds = uv4Var.getBounds();
        boolean z = uv4Var.y0;
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        Iterator<nv4> it = layers.iterator();
        int i = 1;
        while (true) {
            ee7 ee7Var = null;
            if (!it.hasNext()) {
                break;
            }
            nv4 next = it.next();
            if (next instanceof xq4) {
                xq4 xq4Var = (xq4) next;
                ee7Var = new ee7(i, xq4Var.c.getColor(), xq4Var.c.getStrokeWidth(), xq4Var.a);
            }
            if (ee7Var != null) {
                arrayList2.add(ee7Var);
                map.put(next, Integer.valueOf(i));
                i++;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            s9 s9Var = (s9) it2.next();
            e73 e73Var = (!(s9Var instanceof s9) || (num = (Integer) map.get(s9Var.a)) == null) ? null : new e73(num.intValue());
            if (e73Var != null) {
                arrayList3.add(e73Var);
            }
        }
        return new ov4(arrayList2, arrayList3, bounds, z);
    }

    public final void b() {
        zva zvaVar = this.b;
        if (zvaVar != null) {
            boolean z = !this.e.isEmpty();
            ArrayList arrayList = this.d;
            boolean z2 = !arrayList.isEmpty();
            boolean z3 = !arrayList.isEmpty();
            boolean z4 = this.h;
            cwa cwaVar = zvaVar.e;
            cwaVar.getClass();
            cwa cwaVar2 = new cwa(z, z2, z3, cwaVar.o, cwaVar.X, z4, cwaVar.Z);
            zvaVar.e = cwaVar2;
            zvaVar.a.a(cwaVar2);
        }
    }

    public final void c(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        uv4 uv4Var = this.a;
        if (action == 0) {
            motionEvent.getX();
            motionEvent.getY();
            List<nv4> layers = uv4Var.getLayers();
            for (int size = layers.size() - 1; size >= 0; size--) {
                layers.get(size);
            }
            xq4 xq4Var = new xq4(this.f, this.g);
            imc imcVar = new imc(xq4Var);
            this.c = imcVar;
            ((ArrayList) imcVar.c).add(new zq4(motionEvent.getX(), motionEvent.getY()));
            uv4Var.a.add(xq4Var);
            uv4Var.invalidate();
            zva zvaVar = this.b;
            if (zvaVar != null) {
                ((BrushWidthViewImpl) zvaVar.a.t0).setVisibility(8);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            imc imcVar2 = this.c;
            if (imcVar2 != null) {
                imcVar2.W(motionEvent);
            }
            imc imcVar3 = this.c;
            if (imcVar3 != null) {
                s9 s9VarO = imcVar3.O();
                this.e.clear();
                this.d.add(s9VarO);
            }
            this.c = null;
            this.h = true;
            b();
        } else {
            imc imcVar4 = this.c;
            if (imcVar4 != null) {
                imcVar4.W(motionEvent);
            }
        }
        uv4Var.invalidate();
    }
}
