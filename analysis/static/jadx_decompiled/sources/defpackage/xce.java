package defpackage;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xce extends ffe implements a66 {
    public int X;
    public final /* synthetic */ yce Y;
    public final /* synthetic */ CharSequence Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xce(yce yceVar, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.Y = yceVar;
        this.Z = charSequence;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xce) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xce(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        List list;
        Object objT0;
        SpannableStringBuilder spannableStringBuilder;
        Map linkedHashMap;
        Iterator it;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        CharSequence charSequence = this.Z;
        Object obj2 = null;
        yce yceVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            List listP = yceVar.o.p(charSequence);
            if (listP.isEmpty()) {
                kld kldVar = yceVar.E0;
                this.X = 1;
                return kldVar.a(null, this) == tx3Var ? tx3Var : e5fVar;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = listP.iterator();
            while (it2.hasNext()) {
                linkedHashSet.add(new Long(((qu8) it2.next()).a.a));
            }
            moa moaVar = yceVar.O0;
            if (moaVar != null) {
                this.X = 2;
                objT0 = j47.t0(((w9a) ((kke) moaVar.b)).a(), new ice(moaVar, linkedHashSet, null), this);
                if (objT0 == tx3Var) {
                    return tx3Var;
                }
                list = (List) objT0;
            } else {
                list = null;
            }
        } else {
            if (i == 1) {
                od2.a0(obj);
            }
            if (i != 2) {
                if (i == 3) {
                    od2.a0(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
            objT0 = obj;
            list = (List) objT0;
        }
        if (list == null) {
            list = nz4.a;
        }
        cjg cjgVar = yceVar.Q0;
        ArrayList<rce> arrayListD = cjgVar != null ? cjgVar.d(list) : null;
        tce tceVar = new tce(yceVar, 1);
        ph4 ph4Var = yceVar.o;
        ph4Var.getClass();
        if (charSequence == null || w9e.C0(charSequence)) {
            spannableStringBuilder = null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) ph4Var.b;
            spannableStringBuilder2.clear();
            spannableStringBuilder2.clearSpans();
            spannableStringBuilder2.append(charSequence);
            if (arrayListD != null) {
                int iZ = mz7.Z(z53.S(arrayListD, 10));
                if (iZ < 16) {
                    iZ = 16;
                }
                linkedHashMap = new LinkedHashMap(iZ);
                for (rce rceVar : arrayListD) {
                    linkedHashMap.put(Long.valueOf(rceVar.a), rceVar);
                }
            } else {
                linkedHashMap = null;
            }
            if (linkedHashMap == null) {
                linkedHashMap = oz4.a;
            }
            Iterator it3 = ph4Var.p(charSequence).iterator();
            while (it3.hasNext()) {
                qu8 qu8Var = (qu8) it3.next();
                int spanStart = spannableStringBuilder2.getSpanStart(qu8Var);
                int spanEnd = spannableStringBuilder2.getSpanEnd(qu8Var);
                if (spanStart == -1 || spanEnd == -1) {
                    it = it3;
                } else {
                    spannableStringBuilder2.subSequence(spanStart, spanEnd).toString();
                    Object[] spans = spannableStringBuilder2.getSpans(spanStart, spanEnd, Object.class);
                    int length = spans.length;
                    Object obj3 = obj2;
                    int i2 = 0;
                    while (i2 < length) {
                        Object obj4 = spans[i2];
                        Iterator it4 = it3;
                        if (obj3 == null && (obj4 instanceof qu8)) {
                            obj3 = obj4;
                        }
                        spannableStringBuilder2.removeSpan(obj4);
                        i2++;
                        it3 = it4;
                    }
                    it = it3;
                    rce rceVar2 = (rce) linkedHashMap.get(Long.valueOf(qu8Var.a.a));
                    if (rceVar2 != null) {
                        spannableStringBuilder2.setSpan(new mce((k56) ph4Var.a, rceVar2, new bk(11, tceVar)), spanStart, spanEnd, 17);
                        qu8 qu8Var2 = (qu8) obj3;
                        if (qu8Var2 != null) {
                            spannableStringBuilder2.setSpan(qu8Var2, spanStart, spanEnd, 17);
                        }
                    }
                }
                it3 = it;
                obj2 = null;
            }
            spannableStringBuilder = spannableStringBuilder2;
        }
        kld kldVar2 = yceVar.E0;
        this.X = 3;
        return kldVar2.a(spannableStringBuilder, this) == tx3Var ? tx3Var : e5fVar;
    }
}
