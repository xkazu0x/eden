import java.io.*;

public class CmdLineParser {
  private String[] args;
  private String src_file_path;
  private String dst_file_path;

  public
  CmdLineParser(String[] args) {
    this.args = args;
    this.src_file_path = null;
    this.dst_file_path = null;
  }

  public boolean
  parse() {
    boolean result = true;
    if (args.length >= 1) {
      int num_args = args.length;
      for (int i = 0; i < num_args; ++i) {
        String arg = args[i];
        if (arg.contains(".eden")) {
          src_file_path = arg;
        } else if (arg.contains("-o")) {
          int next_arg_index = i + i;
          if (next_arg_index < num_args) {
            dst_file_path = args[next_arg_index];
          } else {
            System.out.printf("[ERROR]: [-o] usage: -o <dst_file_path>\n");
            result = false;
          }
        }
      }
    } else {
      System.out.printf("[INFO]: usage: java Eden <file_path> <options>\n");
      result = false;
    }
    return(result);
  }

  public String
  get_src_file_path() {
    String result = get_full_file_path(src_file_path);
    return(result);
  }

  public String
  get_dst_file_path() {
    String result = null;
    String src_full_file_path = get_full_file_path(src_file_path);
    int one_past_last_slash = src_full_file_path.lastIndexOf("/") + 1;
    if (dst_file_path != null) {
      result = get_full_file_path(dst_file_path);
      int last_char_index = result.length() - 1;
      if (result.charAt(last_char_index) != '/') {
        result += "/";
      }
    } else {
      result = src_full_file_path.substring(0, one_past_last_slash);
    }
    String class_name = get_class_name();
    result += class_name + ".java";
    return(result);
  }

  public String
  get_class_name() {
    String src_full_file_path = get_full_file_path(src_file_path);
    int one_past_last_slash = src_full_file_path.lastIndexOf("/") + 1;
    String src_file_name = src_full_file_path.substring(
      one_past_last_slash,
      src_full_file_path.length()
    );
    String class_name = src_file_name.substring(0, src_file_name.lastIndexOf("."));
    class_name = class_name.substring(0, 1).toUpperCase() + class_name.substring(1);
    return(class_name);
  }

  private String
  get_full_file_path(String file_path) {
    String result = null;
    try {
      File file = new File(file_path);
      result = file.getCanonicalPath();
    } catch (IOException e) {
      e.printStackTrace();
    }
    if (result.contains("\\")) {
      result = result.replace("\\", "/");
    }
    return(result);
  }
}
