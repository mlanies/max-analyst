package defpackage;

import org.msgpack.core.MessageFormatException;

/* loaded from: classes2.dex */
public enum av8 {
    POSFIXINT(3),
    FIXMAP(8),
    FIXARRAY(7),
    FIXSTR(5),
    NIL(1),
    NEVER_USED(0),
    BOOLEAN(2),
    BIN8(6),
    BIN16(6),
    BIN32(6),
    EXT8(9),
    EXT16(9),
    EXT32(9),
    FLOAT32(4),
    FLOAT64(4),
    UINT8(3),
    UINT16(3),
    UINT32(3),
    UINT64(3),
    INT8(3),
    INT16(3),
    INT32(3),
    INT64(3),
    FIXEXT1(9),
    FIXEXT2(9),
    FIXEXT4(9),
    FIXEXT8(9),
    FIXEXT16(9),
    STR8(5),
    STR16(5),
    STR32(5),
    ARRAY16(7),
    ARRAY32(7),
    MAP16(8),
    MAP32(8),
    NEGFIXINT(3);

    public static final av8[] W0 = new av8[256];
    public final int a;

    static {
        av8 av8Var;
        for (int i = 0; i <= 255; i++) {
            byte b = (byte) i;
            if ((b & Byte.MIN_VALUE) != 0) {
                int i2 = b & (-32);
                if (i2 == -32) {
                    av8Var = NEGFIXINT;
                } else if (i2 != -96) {
                    int i3 = b & (-16);
                    if (i3 == -112) {
                        av8Var = FIXARRAY;
                    } else if (i3 != -128) {
                        switch (b) {
                            case -64:
                                av8Var = NIL;
                                break;
                            case -63:
                            default:
                                av8Var = NEVER_USED;
                                break;
                            case -62:
                            case -61:
                                av8Var = BOOLEAN;
                                break;
                            case -60:
                                av8Var = BIN8;
                                break;
                            case -59:
                                av8Var = BIN16;
                                break;
                            case -58:
                                av8Var = BIN32;
                                break;
                            case -57:
                                av8Var = EXT8;
                                break;
                            case -56:
                                av8Var = EXT16;
                                break;
                            case -55:
                                av8Var = EXT32;
                                break;
                            case -54:
                                av8Var = FLOAT32;
                                break;
                            case -53:
                                av8Var = FLOAT64;
                                break;
                            case -52:
                                av8Var = UINT8;
                                break;
                            case -51:
                                av8Var = UINT16;
                                break;
                            case -50:
                                av8Var = UINT32;
                                break;
                            case -49:
                                av8Var = UINT64;
                                break;
                            case -48:
                                av8Var = INT8;
                                break;
                            case -47:
                                av8Var = INT16;
                                break;
                            case -46:
                                av8Var = INT32;
                                break;
                            case -45:
                                av8Var = INT64;
                                break;
                            case -44:
                                av8Var = FIXEXT1;
                                break;
                            case -43:
                                av8Var = FIXEXT2;
                                break;
                            case -42:
                                av8Var = FIXEXT4;
                                break;
                            case -41:
                                av8Var = FIXEXT8;
                                break;
                            case -40:
                                av8Var = FIXEXT16;
                                break;
                            case -39:
                                av8Var = STR8;
                                break;
                            case -38:
                                av8Var = STR16;
                                break;
                            case -37:
                                av8Var = STR32;
                                break;
                            case -36:
                                av8Var = ARRAY16;
                                break;
                            case -35:
                                av8Var = ARRAY32;
                                break;
                            case -34:
                                av8Var = MAP16;
                                break;
                            case -33:
                                av8Var = MAP32;
                                break;
                        }
                    } else {
                        av8Var = FIXMAP;
                    }
                } else {
                    av8Var = FIXSTR;
                }
            } else {
                av8Var = POSFIXINT;
            }
            W0[i] = av8Var;
        }
    }

    av8(int i) {
        this.a = i;
    }

    public final int a() {
        if (this != NEVER_USED) {
            return this.a;
        }
        throw new MessageFormatException("Cannot convert NEVER_USED to ValueType");
    }
}
