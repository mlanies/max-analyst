package defpackage;

import android.content.SharedPreferences;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.function.Function;
import one.me.net.client.impl.internal.SocketFactoryCreateException;
import one.me.rlottie.RLottieDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class di implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ di(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return (RLottieDrawable) ((m56) this.b).invoke(obj);
            case 1:
                return (ti9) ((m56) this.b).invoke(obj);
            case 2:
                return (ti9) ((m56) this.b).invoke(obj);
            case 3:
                return (ti9) ((m56) this.b).invoke(obj);
            case 4:
                return (ti9) ((m56) this.b).invoke(obj);
            case 5:
                return (ti9) ((m56) this.b).invoke(obj);
            case 6:
                return (ti9) ((m56) this.b).invoke(obj);
            case 7:
                return (ti9) ((m56) this.b).invoke(obj);
            case 8:
                return (ti9) ((m56) this.b).invoke(obj);
            case 9:
                return (x77) ((m56) this.b).invoke(obj);
            case 10:
                return (xi9) ((m56) this.b).invoke(obj);
            case 11:
                return (ExecutorService) ((m56) this.b).invoke(obj);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return (zj) ((m56) this.b).invoke(obj);
            case 13:
                return (sba) ((m56) this.b).invoke(obj);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return (ThreadFactory) ((m56) this.b).invoke(obj);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return (u6b) ((m56) this.b).invoke(obj);
            case 16:
                return (u6b) ((m56) this.b).invoke(obj);
            case LangUtils.HASH_SEED /* 17 */:
                return (ti9) ((m56) this.b).invoke(obj);
            case 18:
                return (ti9) ((m56) this.b).invoke(obj);
            case 19:
                return (SharedPreferences) ((m56) this.b).invoke(obj);
            case 20:
                return (ei4) ((m56) this.b).invoke(obj);
            default:
                String str = (String) obj;
                di0 di0Var = (di0) this.b;
                di0Var.getClass();
                try {
                    ((ri4) di0Var.a.a).e();
                    return ((axd) di0Var.c).a(str);
                } catch (IOException e) {
                    throw new SocketFactoryCreateException(e);
                }
        }
    }
}
