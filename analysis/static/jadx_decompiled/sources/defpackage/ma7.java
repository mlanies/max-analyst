package defpackage;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class ma7 implements my9 {
    public final /* synthetic */ int a;

    public /* synthetic */ ma7(int i) {
        this.a = i;
    }

    @Override // defpackage.m05
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ny9 ny9Var = (ny9) obj2;
                ny9Var.a(qob.g, entry.getKey());
                ny9Var.a(qob.h, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
