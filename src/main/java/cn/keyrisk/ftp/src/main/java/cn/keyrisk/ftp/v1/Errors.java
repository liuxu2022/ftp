package cn.keyrisk.ftp.v1;

public interface Errors {

  int OK = 0;
  int OBJECT_NOT_FOUND = 1001;
  int OBJECT_DUPLICATED = 1002;
  int OBJECT_SAVE_FAILED = 1003;
  int CAN_NOT_BE_EMPTY = 1004;
  int CONSTRUCT_NOT_FOUND = 2001;
  int CONSTRUCT_FAILED = 2002;
}