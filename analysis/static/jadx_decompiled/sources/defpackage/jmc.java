package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final class jmc implements ioe {
    public final jlc a;
    public final o45 b;
    public final khe c = new khe(new lwa(20, this));

    public jmc(jlc jlcVar, o45 o45Var) {
        this.a = jlcVar;
        this.b = o45Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0178 A[Catch: ProtoException -> 0x0014, TryCatch #25 {ProtoException -> 0x0014, blocks: (B:3:0x0006, B:4:0x000b, B:5:0x000e, B:6:0x0013, B:9:0x0018, B:10:0x001d, B:11:0x0023, B:13:0x0027, B:15:0x003b, B:19:0x004a, B:22:0x005d, B:23:0x0063, B:24:0x0064, B:25:0x0069, B:26:0x006f, B:29:0x0083, B:30:0x0089, B:31:0x008a, B:32:0x008f, B:33:0x0095, B:35:0x00a9, B:36:0x00af, B:37:0x00b0, B:38:0x00b6, B:39:0x00bb, B:40:0x00c1, B:43:0x00d1, B:44:0x00d7, B:45:0x00d8, B:46:0x00dd, B:47:0x00e3, B:49:0x00f1, B:50:0x0105, B:53:0x010e, B:54:0x0114, B:55:0x0115, B:56:0x011a, B:57:0x0120, B:59:0x012e, B:60:0x0134, B:61:0x0135, B:62:0x013a, B:63:0x0140, B:66:0x0158, B:67:0x015e, B:68:0x015f, B:69:0x0164, B:70:0x016a, B:72:0x016e, B:76:0x0174, B:80:0x017e, B:79:0x0178, B:82:0x018e, B:83:0x0194, B:84:0x0195, B:85:0x019a, B:86:0x01a0, B:88:0x01b5, B:89:0x01bb, B:90:0x01bc, B:91:0x01c1, B:92:0x01c7, B:95:0x01db, B:96:0x01e1, B:97:0x01e2, B:98:0x01e7, B:99:0x01ed, B:101:0x01fc, B:102:0x0202, B:103:0x0203, B:104:0x0209, B:105:0x020e, B:106:0x0214, B:108:0x0218, B:110:0x022c, B:114:0x023b, B:116:0x024d, B:117:0x0253, B:118:0x0254, B:119:0x025a, B:120:0x025f, B:121:0x0265, B:123:0x0274, B:124:0x027a, B:125:0x027b, B:126:0x0280, B:127:0x0286, B:130:0x0298, B:131:0x029e, B:132:0x029f, B:133:0x02a4, B:134:0x02aa, B:136:0x02c8, B:141:0x02e0, B:139:0x02d7, B:140:0x02dc, B:143:0x02e7, B:144:0x02ed, B:145:0x02ee, B:146:0x02f3, B:147:0x02f9, B:149:0x0301, B:150:0x0307, B:152:0x0315, B:153:0x031b, B:154:0x031c, B:155:0x0321, B:156:0x0327, B:158:0x0344, B:159:0x034a, B:160:0x034b, B:161:0x0350, B:162:0x0356, B:164:0x0362, B:165:0x0368, B:166:0x0369, B:167:0x036e, B:168:0x0374, B:170:0x0387, B:171:0x038d, B:172:0x038e, B:173:0x0393, B:174:0x0399, B:176:0x03a8, B:177:0x03ae, B:178:0x03af, B:179:0x03b4, B:180:0x03ba, B:182:0x03c9, B:183:0x03cf, B:184:0x03d0, B:185:0x03d5, B:186:0x03db, B:191:0x03f3, B:200:0x0419, B:197:0x0412, B:199:0x0416, B:202:0x0428, B:203:0x042e, B:204:0x042f, B:205:0x0434, B:206:0x043a, B:208:0x0449, B:209:0x044f, B:210:0x0450, B:211:0x0455, B:212:0x045b, B:214:0x0469, B:243:0x04b6, B:217:0x0473, B:245:0x04c7, B:246:0x04cd, B:247:0x04ce, B:248:0x04d3, B:249:0x04d9, B:251:0x04e8, B:252:0x04ee, B:253:0x04ef, B:254:0x04f4, B:255:0x04fa, B:257:0x0509, B:258:0x050f, B:259:0x0510, B:260:0x0516, B:261:0x051e, B:262:0x0523, B:263:0x0529, B:265:0x0541, B:266:0x0547, B:267:0x0548, B:268:0x054d, B:269:0x0553, B:271:0x0575, B:272:0x057b, B:273:0x057c, B:274:0x0581, B:275:0x0587, B:277:0x059a, B:278:0x05a0, B:279:0x05a1, B:280:0x05a6, B:281:0x05ab, B:282:0x05b1, B:284:0x05c2, B:285:0x05c8, B:286:0x05c9, B:287:0x05ce, B:288:0x05d4, B:290:0x05e7, B:291:0x05ed, B:292:0x05ee, B:293:0x05f3, B:294:0x05f8, B:295:0x05fd, B:296:0x0602), top: B:350:0x0006, inners: #0, #1, #2, #3, #4, #5, #6, #7, #8, #9, #10, #11, #12, #13, #14, #15, #16, #17, #18, #19, #20, #21, #22, #23, #24, #26, #27, #28, #29, #30, #31 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.hua d(defpackage.iua r23, byte[] r24) throws ru.ok.tamtam.nano.ProtoException {
        /*
            Method dump skipped, instructions count: 1670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmc.d(iua, byte[]):hua");
    }

    public final void a(long j) {
        hoe hoeVarB = b();
        ilc ilcVar = hoeVarB.a;
        ilcVar.b();
        zkc zkcVar = hoeVarB.g;
        q36 q36VarF = zkcVar.f();
        q36VarF.j(1, j);
        try {
            ilcVar.c();
            try {
                q36VarF.n();
                ilcVar.r();
            } finally {
                ilcVar.l();
            }
        } finally {
            zkcVar.t(q36VarF);
        }
    }

    public final hoe b() {
        return (hoe) this.c.getValue();
    }

    public final List c(ArrayList arrayList) {
        return l6d.i0(l6d.a0(new r1f(new at(2, arrayList), new om8(1, this, jmc.class, "taskDbFromEntity", "taskDbFromEntity(Lone/me/sdk/tasks/db/TaskEntity;)Lone/me/sdk/tasks/db/TaskDb;", 0, 15)), n71.v0));
    }

    public final une e(long j) {
        vne vneVar;
        hoe hoeVarB = b();
        b46 b46Var = hoeVarB.c;
        xlc xlcVarA = xlc.a(1, "SELECT * FROM tasks WHERE id = ?");
        xlcVarA.j(1, j);
        ilc ilcVar = hoeVarB.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            int iN = tfg.n(cursorO, "id");
            int iN2 = tfg.n(cursorO, "type");
            int iN3 = tfg.n(cursorO, "status");
            int iN4 = tfg.n(cursorO, "fails_count");
            int iN5 = tfg.n(cursorO, "depends_request_id");
            int iN6 = tfg.n(cursorO, "dependency_type");
            int iN7 = tfg.n(cursorO, "data");
            int iN8 = tfg.n(cursorO, "created_time");
            if (cursorO.moveToFirst()) {
                long j2 = cursorO.getLong(iN);
                int i = cursorO.getInt(iN2);
                b46Var.getClass();
                vneVar = new vne(j2, b46.t(i), b46.r(cursorO.getInt(iN3)), cursorO.getInt(iN4), cursorO.getLong(iN5), cursorO.getInt(iN6), cursorO.isNull(iN7) ? null : cursorO.getBlob(iN7), cursorO.getLong(iN8));
            } else {
                vneVar = null;
            }
            if (vneVar != null) {
                return f(vneVar);
            }
            return null;
        } finally {
            cursorO.close();
            xlcVarA.n();
        }
    }

    public final une f(vne vneVar) throws ProtoException {
        hua huaVarD = d(vneVar.b, vneVar.g);
        if (huaVarD != null) {
            return new une(vneVar.a, vneVar.c, vneVar.d, vneVar.e, vneVar.f, huaVarD);
        }
        ((cba) this.b).c(new HandledException("task parse error! " + vneVar.b), true);
        a(vneVar.a);
        return null;
    }
}
