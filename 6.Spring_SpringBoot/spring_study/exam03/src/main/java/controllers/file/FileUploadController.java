package controllers.file;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/file/upload")
public class FileUploadController {

    @GetMapping
    public String upload() {

        return "file/upload";
    }

    @PostMapping
    public String uploadPs() {

        return "file/upload";
    }
}
