package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* loaded from: classes2.dex */
public final class jx8 {
    public final int a;
    public final je7 b;
    public final je7 c;
    public final Context d;
    public final boolean e;

    public jx8(Context context, je7 je7Var, je7 je7Var2, ri4 ri4Var, int i) {
        this.a = i;
        this.b = je7Var;
        this.c = je7Var2;
        this.d = context.getApplicationContext();
        this.e = ri4Var.b().compareTo(vi4.o) >= 0;
    }

    public final ix8 a(byte[] bArr) throws ProtoException {
        c6c c6cVar;
        byte[] bArr2 = b.a;
        try {
            Protos.MessageReactions from = Protos.MessageReactions.parseFrom(bArr);
            ArrayList arrayList = new ArrayList();
            int length = from.reactions.length;
            for (int i = 0; i < length; i++) {
                Protos.ReactionData reactionData = from.reactions[i].reaction;
                int i2 = reactionData.type;
                d6c.b.getClass();
                arrayList.add(new hx8(new c6c(hx9.q(i2), b(reactionData.reaction)), from.reactions[i].count));
            }
            int i3 = from.totalCount;
            Protos.ReactionData reactionData2 = from.yourReaction;
            if (reactionData2 == null) {
                c6cVar = null;
            } else {
                int i4 = reactionData2.type;
                d6c.b.getClass();
                c6cVar = new c6c(hx9.q(i4), b(from.yourReaction.reaction));
            }
            return new ix8(arrayList, i3, c6cVar);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }

    public final v5c b(String str) throws Resources.NotFoundException {
        return new v5c(((tx4) this.b.getValue()).b(this.d.getResources().getDimensionPixelSize(this.a), str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [ix8] */
    public final LinkedHashMap c(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(mz7.Z(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            fx8 fx8Var = (fx8) entry.getValue();
            if (fx8Var != null) {
                List<cx8> list = fx8Var.a;
                ArrayList arrayList = new ArrayList(z53.S(list, 10));
                for (cx8 cx8Var : list) {
                    arrayList.add(new hx8(d(cx8Var.a), cx8Var.b));
                }
                bx8 bx8Var = fx8Var.c;
                ix8Var = new ix8(arrayList, fx8Var.b, bx8Var != null ? d(bx8Var) : null);
            }
            linkedHashMap.put(key, ix8Var);
        }
        return linkedHashMap;
    }

    public final c6c d(bx8 bx8Var) {
        hx9 hx9Var = d6c.b;
        int i = bx8Var.a.a;
        hx9Var.getClass();
        return new c6c(hx9.q(i), b(bx8Var.b));
    }
}
